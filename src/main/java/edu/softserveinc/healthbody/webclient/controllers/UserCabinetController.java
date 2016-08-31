package edu.softserveinc.healthbody.webclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyService;
import edu.softserveinc.healthbody.webclient.healthbody.webservice.HealthBodyServiceImplService;
//import edu.softserveinc.healthbody.webclient.wrapperD.URLFormatter;
import edu.softserveinc.healthbody.webclient.utils.GoogleFitUtils;

@Controller
public class UserCabinetController {

	@RequestMapping(value = "/userCabinet.html", method = RequestMethod.GET)
	public String getUserList(Model model, @Autowired HealthBodyServiceImplService healthBody) {
		String userLogin = SecurityContextHolder.getContext().getAuthentication().getName();
		/* request.getUserPrincipal().getName(); */
		HealthBodyService service = healthBody.getHealthBodyServiceImplPort();
		
		/* Rest **/
//		URLFormatter formatter = new URLFormatter();
//		model.addAttribute("user", formatter.getUserByLogin("UserByLogin", userLogin));
		/* Fit steps a day */
		String gettedAccessToken = GoogleFitUtils.postForAccessToken(service.getUserByLogin(userLogin).getGoogleApi());
		Long startTime = (System.currentTimeMillis()-24*60*60*1000);
		String fitData = GoogleFitUtils.post(gettedAccessToken, startTime, System.currentTimeMillis());
		String stepCount = GoogleFitUtils.getStepCount(fitData);
		/* SOAP **/
		model.addAttribute("steps", stepCount);
		model.addAttribute("user", service.getUserByLogin(userLogin));
		model.addAttribute("usercompetitions", service.getAllCompetitionsByUser(1, Integer.MAX_VALUE, userLogin));
		return "userCabinet";
	}

}
