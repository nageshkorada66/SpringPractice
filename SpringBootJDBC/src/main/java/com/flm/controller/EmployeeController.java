package com.flm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/save")
	public String saveEmployee() {
		
		Employee emp = new Employee();
		
		
		jdbcTemplate.update("insert into employees values(?,?,?)",5,"Madhu",11000);
		return "Saved Employee";
	}
}
