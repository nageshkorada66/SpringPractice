package com;

import java.io.ObjectInputFilter.Config;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.Configs;
import com.dao.StudentDAO;
import com.entity.Student;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configs.class);
		StudentDAO studentDAO = context.getBean(StudentDAO.class, "studentDAO");
		
//		student data added to database
		
		Student st = new Student("Fayaz", 60);
		studentDAO.saveStudent(st);

//		student data fetch from the database
//		Student student = studentDAO.getStudent(1);
//		System.out.println(student);
		
		
//		student data updated..
//		Student student = studentDAO.getStudent(1);
//		student.setMarks(50);
//		studentDAO.updateStudent(student);
		
//		student data deleted..
//		Student student = studentDAO.getStudent(1);
//		studentDAO.deleteStudent(student);
	}
}
