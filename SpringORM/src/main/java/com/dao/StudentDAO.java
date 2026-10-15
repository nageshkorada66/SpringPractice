package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Student;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class StudentDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public void saveStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(student);
	}
}
