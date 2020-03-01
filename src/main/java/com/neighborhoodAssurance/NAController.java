package com.neighborhoodAssurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NAController {
	
	//private ServiceStub

	@RequestMapping(value="/index", method=RequestMethod.GET) 
	public String index()
	{
		return "index";
		
	}
	
	/**
	 * Reads JSON
	 * @return Returns JSON object
	 */
	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	@ResponseBody
	public String readJSON() 
	{
		return "index";
	}
	/*@RequestMapping(value="/index", method=RequestMethod.GET)
	public String readSearchValue(@RequestParam(value="searchTerm", required=true)String searchTerm) //May need defaultValue="
	{  
		/*
		 * DTO Information?
		 
		
		return "index";
		}*/
	 
	/**
	 * Endpoint the search bar will submit to
	 * prevents error once entering search term and submitting
	 * @return
	 */
	@RequestMapping("/searchResults")
	public String searchResults(@RequestParam(value="searchTerm", required=true)String searchTerm) //The annotation and values describe the String var searchTerm
	{
		String enhancedTerm = searchTerm + ""; 
		return "index";
	}
}