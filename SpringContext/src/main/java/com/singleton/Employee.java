package com.singleton;

public class Employee {
	
	private static Employee employee;
	
	private Employee() { 
		
	}
	
	public static Employee getEmployee() {

		if(employee == null) {
			employee = new Employee();
			return employee;
		}else {
			return employee;
		}
	}
}
