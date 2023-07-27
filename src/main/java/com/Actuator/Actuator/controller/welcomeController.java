package com.Actuator.Actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

	@GetMapping("/welcome")
	public String getMsg() {
		return "welcome";
	}
	
	
}
