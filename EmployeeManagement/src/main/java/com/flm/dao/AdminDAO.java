package com.flm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.flm.model.Admin;

import jakarta.transaction.Transactional;

@Component
public class AdminDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public String login(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		return null;
	}
	
	@Transactional
	public String signup(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		
		session.persist(admin);
		return admin.getUserName();
	}
}
