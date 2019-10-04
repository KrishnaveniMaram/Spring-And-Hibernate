package com.bookapp.model.persistance;

import java.util.List;

import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDaoImpl  implements  BookDao{
	private SessionFactory factory;
	 public BookDaoImpl() {
		// TODO Auto-generated constructor stub
		factory=HibernateSessionFactory.getSessionFactory();
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		List<Book>books=session.createQuery("from Book").list();
				session.close();
		return books;
	}

	@Override
	public Book getBookById(int bookId) {
		Session session=factory.openSession();
		Book book=(Book) session.get(Book.class, bookId);
		// TODO Auto-generated method stub
		return book;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
		try{
			transaction.begin();
			session.save(book);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
		}
		return book;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
		try{
			transaction.begin();
			session.update(book);
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
		}
		return book;
	}

	@Override
	public Book removeBook(int bookId) {
		// TODO Auto-generated method stub
		Session session=factory.openSession();
		Transaction transaction=session.getTransaction();
		Book bookToBeDeleted=null;
		try{
			transaction.begin();
			bookToBeDeleted=getBookById(bookId);
			session.delete(bookToBeDeleted);
			
			
			transaction.commit();
		}catch(HibernateException e){
			transaction.rollback();
		}
		return bookToBeDeleted;
	}

}
