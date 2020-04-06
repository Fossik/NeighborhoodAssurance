package com.neighborhoodAssurance;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.service.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NAController {
	
	@Autowired
	private IAgencyService agencyServiceStub;

	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public ModelAndView home() {
		AgencyDTO agencyDTO = agencyServiceStub.fetchByOri("HI0010000");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("agencyDTO", agencyDTO);
		return modelAndView;
	}
	/**
	 * Endpoint for a user to log in
	 * Adds the ability to create personolized information
	 * @return
	 */
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login{
		return "login";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	public String readJSON() {
		return "home";
	}
}