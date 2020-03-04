package com.neighborhoodAssurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NAController {
	
	//private ServiceStub
	private final String HOME_PATH = "/index";

	@RequestMapping(value=HOME_PATH, method=RequestMethod.GET) 
	public String index()
	{
		return HOME_PATH.replace("/", "");
		
	}
	@RequestMapping(value=HOME_PATH, method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	@ResponseBody
	public String readJSON() 
	{
		/*
		 * DTO Information
		 */
		return HOME_PATH.replace("/", ""); //return DTO
	}
	/*@RequestMapping(value=HOME_PATH, method=RequestMethod.GET)
	public String readSearchValue(@RequestParam(value="searchTerm", required=true)String searchTerm) //May need defaultValue="
	{  
		/*
		 * DTO Information?
		 
		
		return HOME_PATH.replace("/", "");
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
		return HOME_PATH.replace("/", "");
	}
}