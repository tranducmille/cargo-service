package com.cargo.db.repository;

import java.io.IOException;
import java.util.List;

import com.cargo.db.entity.Book;

/**
 * @author created by dtran
 * A DAO interface
 */
public interface BookInMemoryDAO {

	public List<Book> getBookList() throws Exception;
	
	public List<Book> getBookList(String isbn) throws Exception;

	public Book getBook(int id) throws Exception ;

	public void deleteBook(int id) throws Exception ;

	public void addBook(Book book) throws Exception;
	
	public void updateBook(Book book) throws Exception;
}
