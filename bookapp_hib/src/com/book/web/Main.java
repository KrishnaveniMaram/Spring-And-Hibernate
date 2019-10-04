package com.book.web;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class Main {
	public static void main(String args[]){
		
		/*BookService bookService =new BookServiceImpl ();
		Book book=new Book(1, "AGSF$", "JAVA", "jhon", 100.00);
		bookService.addBook(book);
		List<Book> books=bookService.getAllBooks();
		for(Book book: books){
			System.out.println(book);
		}
		System.out.println(book);
		System.out.println("book is added");
			*/
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		BookService bookService=(BookService) ctx.getBean("bs");
		List<Book>books =bookService.getAllBooks();
		for(Book book:books){
			System.out.println(book);
		}
		
		Book book1=bookService.getBookById(2);
		System.out.println(book1);
		Book book2=bookService.removeBook(3);
		System.out.println(book2);
		
		
		
		
		
		
		
	}

}
