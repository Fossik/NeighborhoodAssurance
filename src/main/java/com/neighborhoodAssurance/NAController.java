package com.neighborhoodAssurance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NAController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
