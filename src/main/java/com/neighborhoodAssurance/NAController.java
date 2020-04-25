
package com.neighborhoodAssurance;
import com.neighborhoodAssurance.dto.CrimeDataByStateDTO;
import com.neighborhoodAssurance.service.ICrimeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NAController {

	Logger logger = LoggerFactory.getLogger(NAController.class);

	@Autowired
	private ICrimeDataService crimeDataService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String readJSON() {
		return "home";
	}

	/*@RequestMapping(value="/searchresults", method=RequestMethod.GET)
	public String doSearch(@RequestParam String searchState, @RequestParam String searchYearFrom, @RequestParam String searchYearTo, @RequestParam int searchGo) {
		logger.info("Request successful we got: " + searchState + ", " + searchYearFrom + ", " + searchYearTo);
		return "searchresults";
	}*/
     
	@RequestMapping(value="/searchresults", method=RequestMethod.GET)
	public String doSearch(@RequestParam String state, @RequestParam int startingYear, @RequestParam int endingYear, @RequestParam int searchGo) {
		try {
			state = Constants.ConvertStateToAbbreviation(state);
			List<CrimeDataByStateDTO> fetchCrimeDataByState = crimeDataService.fetchByState(state, startingYear, endingYear);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "searchresults";
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String goToAbout(@RequestParam int goToAbout) {
		logger.info("Successful navigation to the About page.");
		return "about";
	}
}