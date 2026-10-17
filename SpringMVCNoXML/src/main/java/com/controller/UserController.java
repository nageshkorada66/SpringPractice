package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@RequestMapping("/name")
	@ResponseBody
	public String name() {
		return "Nagesh";
	}

	@RequestMapping("/hi")
	public String hi() {
		return "Hi";
	}
}
