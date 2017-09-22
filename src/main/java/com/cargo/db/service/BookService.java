package com.cargo.db.service;

import java.io.IOException;
import java.util.List;

import com.cargo.db.entity.Book;
/**
 * @author created by dtran
 * A Service Interface
 */
public interface BookService {

	public List<Book> getBookList() throws Exception;
	
	public List<Book> getBookList(String isbn) throws Exception;
	
	public Book getBook(int id) throws  Exception;
	
	public void deleteBook(int id) throws Exception;
	
	public void addBook(Book book) throws Exception;
	
	public void update(Book book) throws Exception;
	
}
