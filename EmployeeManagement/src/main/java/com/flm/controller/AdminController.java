package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flm.model.Admin;
import com.flm.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/login")
	public String login() {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request) {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Admin admin = adminService.loginAdmin(userName, password);
		if(admin != null) {
			return "redirect:/flm/employees";
		}else {
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/signup")
	
	public String signup(HttpServletRequest request) {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		adminService.signupAdmin(userName, password);
		
		return "redirect:/";
	}
}
