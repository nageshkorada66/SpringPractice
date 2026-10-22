package com.flm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	@GetMapping("/employees")
	@ResponseBody
	public String employees() {
		return "Login Success";
	}
}
