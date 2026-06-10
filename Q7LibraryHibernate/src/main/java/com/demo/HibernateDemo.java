package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class HibernateDemo {
	public static void main(String[] args) {
		/*
		 * Build with mvn clean install. Run with mvn exec:java
		 * -Dexec.mainClass="com.demo.HibernateDemo"
		 */

		// Create SessionFactory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Create Session
		Session session = factory.openSession();

		try {
			// Begin transaction
			session.beginTransaction();

			// Create Student object
			Student s1 = new Student("GK", "CDAC", 95);

			// Save student
			session.persist(s1);

			// Commit transaction
			session.getTransaction().commit();

			System.out.println("Student saved successfully!");
		} finally {
			session.close();
			factory.close();
		}
	}
}
