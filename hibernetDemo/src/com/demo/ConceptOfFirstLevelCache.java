package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConceptOfFirstLevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session  session =factory.openSession();
		Book book=(Book) session.load(Book.class, 2);
		System.out.println(book.getAuthor());
		Book book2=(Book) session.get(Book.class, 1);
		//System.out.println(book.getAuthor());
		session.close();
		factory.close();
	}

}
