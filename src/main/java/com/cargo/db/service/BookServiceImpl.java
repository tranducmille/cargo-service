package com.cargo.db.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.db.base.BaseDAO;
import com.cargo.db.base.BaseService;
import com.cargo.db.entity.Book;
import com.cargo.db.repository.BookInMemoryDAO;

/**
 * @author created by dtran
 * A Service implementation
 */
@Service("bookService")
@Transactional
public class BookServiceImpl extends BaseService<Book, BaseDAO> implements BookService{

	@Autowired(required = true)
	BookInMemoryDAO bookDAO;
	
	public BookServiceImpl(){}
	
	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.service.BookService#getBookList()
	 */
	public List<Book> getBookList() throws Exception {
		return bookDAO.getBookList();
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.service.BookService#getBookList(java.lang.String)
	 */
	public List<Book> getBookList(String isbn) throws Exception {
		return bookDAO.getBookList(isbn);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.service.BookService#getBook(int)
	 */
	public Book getBook(int id) throws Exception {
		return bookDAO.getBook(id);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.service.BookService#deleteBook(int)
	 */
	public void deleteBook(int id) throws Exception {
		bookDAO.deleteBook(id);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.service.BookService#addBook(com.xtivia.book.portlet.entity.Book)
	 */
	public void addBook(Book book) throws Exception {
		bookDAO.addBook(book);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.service.BookService#update(com.xtivia.book.portlet.entity.Book)
	 */
	public void update(Book book) throws Exception {
		bookDAO.updateBook(book);		
	}

}
