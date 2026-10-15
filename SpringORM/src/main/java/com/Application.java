package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDAO;
import com.entity.Student;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO studentDAO = context.getBean(StudentDAO.class, "studentDAO");
		
		Student st = new Student("Fayaz", 40);
		studentDAO.saveStudent(st);
	}
}
