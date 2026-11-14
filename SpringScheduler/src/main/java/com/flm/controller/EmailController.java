package com.flm.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailController {
	
	@Scheduled(cron = "* 8 17 * * *")
	public void sendEmail() {
		System.out.println("sent Email.......");
	}

}
