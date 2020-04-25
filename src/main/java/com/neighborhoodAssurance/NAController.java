
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
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NAController {

	Logger logger = LoggerFactory.getLogger(NAController.class);

	@Autowired
	private ICrimeDataService crimeDataService;
	
	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String readJSON() {
		return "home";
	}
     
	@RequestMapping(value="/searchresults", method=RequestMethod.GET)
	public ModelAndView doSearch(@RequestParam String state, @RequestParam int startingYear, @RequestParam int endingYear) {
		ModelAndView mav = new ModelAndView("searchresults");
		try {
			state = Constants.ConvertStateToAbbreviation(state);
			List<CrimeDataByStateDTO> fetchCrimeDataByState = crimeDataService.fetchByState(state, startingYear, endingYear);
			mav.addObject("CrimeDataByState", fetchCrimeDataByState);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ModelAndView("error");
		}
		return mav;
	}
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String goToAbout(@RequestParam int goToAbout) {
		logger.info("Successful navigation to the About page.");
		return "about";
	}
}