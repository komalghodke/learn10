package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Book;

public class BookDAO {
	private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

	public void addBook(Book b) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(b);
		session.getTransaction().commit();
		session.close();
	}

	public List<Book> getAllBooks() {
		Session session = factory.openSession();
		List<Book> list = session.createQuery("from Book", Book.class).list();
		session.close();
		return list;
	}
}
