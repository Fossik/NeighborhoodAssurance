package com.neighborhoodAssurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NeighborController {

	@RequestMapping(value="/index", method=RequestMethod.GET) 
	public String index()
	{
		return "index";
		
	}
	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	@ResponseBody
	public String readJSON() 
	{
		return "index";
	}
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