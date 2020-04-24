package com.neighborhoodAssurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NAController {

	Logger logger = LoggerFactory.getLogger(NAController.class);
	
	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String readJSON() {
		return "home";
	}

	@RequestMapping(value="/searchresults", method=RequestMethod.GET)
	public String doSearch(@RequestParam String searchState, @RequestParam String searchYearFrom, @RequestParam String searchYearTo, @RequestParam int searchGo) {
		logger.info("Request successful! We got: " + searchState + ", " + searchYearFrom + ", " + searchYearTo);
		return "searchresults";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String goToAbout(@RequestParam int goToAbout) {
		logger.info("Successful navigation to the About page.");
		return "about";
	}
	
}