package edu.softserveinc.healthbody.webclient.utils;

import java.util.ArrayList;
import java.util.List;

import edu.softserveinc.healthbody.webclient.healthbody.webservice.CompetitionDTO;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.UserCompetitionsDTO;

public class FitData {

	public static void updateUsersScoresInCompetition(HealthBodyService service, String login) {

		List<String> competitionsIds = getAllCompetitionsIds(service, login);
		for (String competitionId : competitionsIds) {
			String gettedAccessToken = GoogleFitUtils.postForAccessToken(service.getUserByLogin(login).getGoogleApi());
			Long startTime = CustomDateFormater
					.getDateInMilliseconds(service.getCompetitionViewById(competitionId).getStartDate());
			String fitData = GoogleFitUtils.post(gettedAccessToken, startTime, System.currentTimeMillis());
			String stepCount = GoogleFitUtils.getStepCount(fitData);
			UserCompetitionsDTO userCompetition = service.getUserCompetition(competitionId, login);
			userCompetition.setUserScore(stepCount);
			service.updateUserCompetition(userCompetition);
		}

	}

	public static List<String> getAllCompetitionsIds(HealthBodyService service, String login) {
		List<String> competitionsIds = new ArrayList<>();
		for (CompetitionDTO competitionDTO : service.getAllActiveCompetitionsByUser(1, Integer.MAX_VALUE, login)) {
			competitionsIds.add(competitionDTO.getIdCompetition());
		}
		return competitionsIds;
	}

}
