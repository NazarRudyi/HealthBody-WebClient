package edu.softserveinc.healthbody.webclient.utils;

import edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyServiceImplService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.UserCompetitionsDTO;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.UserDTO;

public class FitData implements Runnable {
	public static FitData fitData = null;

	private FitData() {

	}

	public static FitData getInstance() {
		if (fitData == null) {
			fitData = new FitData();
		}
		return fitData;
	}

	public synchronized void updateUsersScoresInCompetition() {

		HealthBodyService service = new HealthBodyServiceImplService().getHealthBodyServiceImplPort();
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

	@Override
	public void run() {
		this.updateUsersScoresInCompetition();

	}
}
