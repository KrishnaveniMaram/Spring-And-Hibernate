package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.getTransaction();
		try
		{
			tx.begin();
			Book book=(Book) session.get(Book.class,2);
			if(book!=null){
				book.setPrice(450);
				book.setAuthor("bhushan");
				session.update(book);
			}
			tx.commit();
	}catch(HibernateException e){
		tx.rollback();
		}
	}

}
