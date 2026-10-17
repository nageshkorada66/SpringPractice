package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class UserController {
	
	@RequestMapping("/hi")
	public String sayHi(Model model) {
		model.addAttribute("name", "Nagesh");
		return "Hi";
	}

	//if we remove the @ResponseBody annotation on below method, then we will see the data from Bye.jsp file.
	@RequestMapping("/bye")
	@ResponseBody
	public String sayBye() {
		return "Bye";
	}
}
