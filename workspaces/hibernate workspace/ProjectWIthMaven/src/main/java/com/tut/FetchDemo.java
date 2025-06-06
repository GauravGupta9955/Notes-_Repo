package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		
		//get ,load
		System.out.println("projected started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		Student student=(Student)session.load(Student.class, 1);	
		System.out.println(student);
		
		Address ad =(Address)session.get(Address.class, 1);
		System.out.println(ad);
		
		session.close();
		factory.close();
	}

}
