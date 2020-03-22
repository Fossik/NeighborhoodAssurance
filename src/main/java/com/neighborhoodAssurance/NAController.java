package com.neighborhoodAssurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NAController {

	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String home() {
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
