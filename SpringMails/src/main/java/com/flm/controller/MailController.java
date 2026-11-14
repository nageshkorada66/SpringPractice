package com.flm.controller;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@PostMapping("/send")
	public String sendEmail(@RequestParam String toEmail) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(toEmail);
		mail.setSubject("Enrolled  successfully!!!");
		mail.setText("Thanks for sucessfully Enrolling into Java Full Stack!!!");
		mail.setCc("saradhajustforfun1@gmail.com");
		
		javaMailSender.send(mail);
		return "Mail sent sucessfully";
	}

}
