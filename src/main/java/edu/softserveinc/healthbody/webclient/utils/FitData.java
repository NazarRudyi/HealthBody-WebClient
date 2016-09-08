package edu.softserveinc.healthbody.webclient.utils;

import edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.UserCompetitionsDTO;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.UserDTO;

public class FitData {
	private static FitData fitData = null;

	public static FitData getInstanse() {
		if (fitData == null) {
			synchronized (FitData.class) {
				if (fitData == null) {
					fitData = new FitData();
				}
			}
		}
		return fitData;
	}

	public void updateUsersScoresInCompetition(HealthBodyService service) {
		for (UserDTO userDTO : service.getAllUsers(0, 0)) {
			for (CompetitionDTO competitionDTO : service.getAllActiveCompetitionsByUser(0, 0, userDTO.getLogin())) {
				String gettedAccessToken = GoogleFitUtils
						.postForAccessToken(service.getUserByLogin(userDTO.getLogin()).getGoogleApi());
				Long startTime = CustomDateFormater.getDateInMilliseconds(
						service.getCompetitionViewById(competitionDTO.getIdCompetition()).getStartDate());
				String fitData = GoogleFitUtils.post(gettedAccessToken, startTime, System.currentTimeMillis());
				String stepCount = GoogleFitUtils.getStepCount(fitData);
				UserCompetitionsDTO userCompetition = service.getUserCompetition(competitionDTO.getIdCompetition(),
						userDTO.getLogin());
				userCompetition.setUserScore(stepCount);
				service.updateUserCompetition(userCompetition);
			}
		}
	}
}
