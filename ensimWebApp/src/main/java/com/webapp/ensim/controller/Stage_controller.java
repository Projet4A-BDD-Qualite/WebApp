package com.webapp.ensim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class Stage_controller {
	
	@RequestMapping("/stage_etranger")
	public String login() {
	
		return "stage_etranger";
	}

}
