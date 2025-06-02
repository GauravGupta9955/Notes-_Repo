package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		
		System.out.println("projected started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(14134);
		student1.setName("Gautam");
		student1.setCity("ranchi");
		
		Certificate certi =new Certificate();
		certi.setCourse("Android");
		certi.setDuration("2month");
		student1.setCerti(certi);
		
		Student student2 = new Student();
		student2.setId(14135);
		student2.setName("Ramu");
		student2.setCity("Ramgarh");
		
		Certificate certi1 =new Certificate();
		certi1.setCourse("web");
		certi1.setDuration("3month");
		student2.setCerti(certi1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//objects save
		session.save(student1);
		session.save(student2);
		tx.commit();
		
		
		
		session.close();
		factory.close();
	}

}
