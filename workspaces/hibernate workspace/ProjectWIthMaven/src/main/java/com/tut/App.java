package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("projected started");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating Student
		Student st = new Student();
		st.setCity("Ranchi");
		st.setName("Gautam");

		System.out.println(st);

		Address ad = new Address();
		ad.setStreet("ParkStreet");
		ad.setCity("kolkata");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(122.555);
		FileInputStream fis = new FileInputStream(
				"E:\\workspaces\\hibernate workspace\\ProjectWIthMaven\\src\\main\\java\\sytem.png");
		
		byte[] data = new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);

		System.out.println(ad);

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();

		session.close();

		System.out.println("Done.....");
	}
}
