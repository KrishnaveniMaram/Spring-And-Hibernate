package com.bookapp.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;
@Service
@Transactional
public class BookServiceImpl  implements BookService{
	@Autowired
	private BookDao dao;

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		Book book=dao.getBookById(bookId);
		if(book==null)
			throw new BookNotFoundException("book with id:"+bookId+"not found");
		return book ;
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return dao.updateBook(book);
	}

	@Override
	public Book removeBook(int bookId) {
		// TODO Auto-generated method stub
		return dao.removeBook(bookId);
	}

}
