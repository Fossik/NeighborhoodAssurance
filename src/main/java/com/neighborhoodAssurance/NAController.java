package com.neighborhoodAssurance;

import com.neighborhoodAssurance.dto.AgencyDTO;
import com.neighborhoodAssurance.dto.HawaiiAgencies;
import com.neighborhoodAssurance.service.IAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NAController {

	Logger logger = LoggerFactory.getLogger(NAController.class);

	@Autowired
	private IAgencyService agencyService;

	/**@RequestMapping(value="/home", method=RequestMethod.GET) 
	public ModelAndView home() {
		AgencyDTO agencyDTO = agencyServiceStub.fetchByORI("HI0010000");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("agencyDTO", agencyDTO);
		return modelAndView;
	}**/
	
	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String readJSON() {
		return "home";
	}
	
	@RequestMapping("/searchResults")
	public String searchResults(@RequestParam(value="searchTerm", required=false, defaultValue="") String searchTerm) {
		String enhancedTerm = searchTerm + "";
		try {
			List<HawaiiAgencies> fetchAgency = agencyService.fetchAgencies(searchTerm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		return "searchResults";
	}
	
	/**@RequestMapping(value="/home", method=RequestMethod.GET)
	@ResponseBody
	public AgencyDTO read(Model model) {
		AgencyDTO agencyDTO = agencyServiceStub.fetchByORI("HI0010000");
		model.addAttribute("agencyDTO", agencyDTO);
		return agencyDTO;
	}**/

	/**@RequestMapping(value="/searchResults", method=RequestMethod.GET)
	public String doSearch(@RequestParam String searchTerm, @RequestParam int submit) {
		logger.info("Request successful we got: " + searchTerm);
		return "searchResults";
	}**/
}