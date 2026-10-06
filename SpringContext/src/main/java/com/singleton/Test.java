package com.singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = Employee.getEmployee();
		
		System.out.println(emp1.hashCode());
		
		Employee emp2 = Employee.getEmployee();
		
		System.out.println(emp2.hashCode());

	}

}
