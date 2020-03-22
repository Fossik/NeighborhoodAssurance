package com.neighborhoodAssurance;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.service.IAgencyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NAController {
	
	@Autowired
	private IAgencyService agencyServiceStub;

	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String home(Model model) {
		AgencyDTO agencyDTO = agencyServiceStub.fetchByOri("HI0010000");
		model.addAttribute("agencyDTO", agencyDTO);
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	public String readJSON() {
		return "home";
	}
	
	/*@RequestMapping(value="/index", method=RequestMethod.GET, params= {"loyalty=blue"}) 
	public String readBlue() {
		return "index";
	} this is just an example */
}