package com.flm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flm.model.User;

@Controller
public class TestController {

	@GetMapping("/hi")
	public String hi(Model model) {
		model.addAttribute("name", "Nagesh");
		return "hi";
	}
	
	@GetMapping("/home")
	public String openLogin(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, Model model) {
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		
		return "data";
	}
	
	@PostMapping("/login2")
	public String login2(@ModelAttribute User user, Model model) {
		model.addAttribute("email", user.getEmail());
		model.addAttribute("password", user.getPassword());
		
		return "data";
	}
	
	@GetMapping("/users")
	public String users(Model model) {
		List<User> users = new ArrayList<User>();
		users.add(new User("nagesh@gmail.com","1234"));
		users.add(new User("heartrobber","420"));
		users.add(new User("malathi@gmail","su3"));
		
		model.addAttribute("usersList", users);
		
		return "users";		
	}
}
