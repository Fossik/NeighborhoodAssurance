package com.neighborhoodAssurance;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.service.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NAController {

	Logger logger = LoggerFactory.getLogger(NAController.class);

	@Autowired
	private IAgencyService agencyServiceStub;

	@RequestMapping(value="/", method=RequestMethod.GET) 
	public ModelAndView home() {
		AgencyDTO agencyDTO = agencyServiceStub.fetchByORI("HI0010000");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("agencyDTO", agencyDTO);
		return modelAndView;
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	public String readJSON() {
		return "home";
	}

	@RequestMapping(value="/searchResults", method=RequestMethod.GET)
	public String doSearch(@RequestParam String searchTerm, @RequestParam int submit) {
		logger.info("Request successful we got: " + searchTerm);
		return "home";
	}
}