package com.qa.cinema.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qa.cinema.constants.Constants;

@Controller
public class HomeController {
	
	@RequestMapping(Constants.HOME)
	public String home() {
		return Constants.INDEX;
	}
}
