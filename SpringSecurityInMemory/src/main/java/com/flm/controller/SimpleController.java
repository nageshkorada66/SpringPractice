package com.flm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi";
	}

	@GetMapping("/bye")
	public String bye() {
		return "Bye";
	}
	
	@GetMapping("/open")
	public String open() {
		return "Open Endpoint";
	}
	
	@GetMapping("/noAccess")
	public String noAccess() {
		return "No Access";
	}
}
