package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.multipleclasses.SimTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new AnnotationConfigApplicationContext(Configs.class);
		User user = container.getBean("user",User.class);
		
		System.out.println(user);
		
		System.out.println("===============================================");
		
		SimTest simTest = container.getBean("test", SimTest.class);
		simTest.test();
		
	}
}
