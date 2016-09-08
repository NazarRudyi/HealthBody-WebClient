package edu.softserveinc.healthbody.webclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyServiceImplService;
import edu.softserveinc.healthbody.webclient.utils.GoogleFitUtils;

@Controller
public class HomePageController {
			
	@RequestMapping("/homePage.html")
	public String homePage() {
		return "homePage";
	}
	
	@RequestMapping("/login.html")
	public String login(@Autowired HealthBodyServiceImplService healthBody) {
		HealthBodyService service = healthBody.getHealthBodyServiceImplPort();
		GoogleFitUtils.updateUsersScoresInCompetition(service);
		return "login";
	}
}
