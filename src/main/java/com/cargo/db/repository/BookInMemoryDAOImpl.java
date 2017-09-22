package com.cargo.db.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.validation.Validator;

import com.cargo.db.base.BaseDAO;
import com.cargo.db.entity.Book;

/**
 * @author created by dtran
 * A DAO implementation
 */
@Repository("bookDAO")
@Transactional
public class BookInMemoryDAOImpl extends BaseDAO<Book, Number> implements BookInMemoryDAO {
	
	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.repository.BookInMemoryDAO#getBookList()
	 */
	@Transactional
	public List<Book> getBookList() throws Exception {
		return this.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.repository.BookInMemoryDAO#getBookList(java.lang.String)
	 */
	@Transactional
	public List<Book> getBookList(String isbn) throws Exception {
		return this.findByCriteria("isbn", isbn);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.repository.BookInMemoryDAO#getBook(int)
	 */
	@Transactional
	public Book getBook(int id) throws Exception {
		return this.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.repository.BookInMemoryDAO#deleteBook(int)
	 */
	@Transactional
	public void deleteBook(int id) throws Exception {
		Book book = this.findById(id);
		if(book != null){
			this.delete(book);
		}
	}
	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.repository.BookInMemoryDAO#addBook(com.xtivia.book.portlet.entity.Book)
	 */
	@Transactional
	public void addBook(Book book) throws Exception {
		this.save(book);		
	}

	/* (non-Javadoc)
	 * @see com.xtivia.book.portlet.repository.BookInMemoryDAO#updateBook(com.xtivia.book.portlet.entity.Book)
	 */
	@Transactional
	public void updateBook(Book book) throws Exception {
		this.saveOrUpdate(book);
		
	}

}
