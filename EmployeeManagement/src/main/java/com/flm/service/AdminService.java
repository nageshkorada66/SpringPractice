package com.flm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.dao.AdminDAO;
import com.flm.model.Admin;

@Component
public class AdminService {
	
	@Autowired
	AdminDAO adminDAO;
	
	public String loginAdmin(String userName, String password) {
		
		Admin admin = new Admin(userName, password);
		
		return null;
	}
	
	public String signupAdmin(String userName, String password) {
		Admin admin = new Admin(userName, password);
		
		return adminDAO.signup(admin);
	}

}
