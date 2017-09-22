package com.cargo.db.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cargo.db.base.BaseDAO;
import com.cargo.db.entity.DBCustomer;
import com.cargo.db.entity.DBCustomer;

/**
 * @author created by dtran
 * A DAO implementation
 */
@Repository("customerDAO")
@Transactional
public class CustomerDAOImpl extends BaseDAO<DBCustomer, Number> implements CustomerDAO {
	
	/* (non-Javadoc)
	 * @see com.xtivia.Customer.portlet.repository.CustomerInMemoryDAO#getCustomerList()
	 */
	@Transactional
	public List<DBCustomer> getCustomerList() throws Exception {
		return this.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.xtivia.Customer.portlet.repository.CustomerInMemoryDAO#getCustomerList(java.lang.String)
	 */
	@Transactional
	public List<DBCustomer> getCustomerList(String isbn) throws Exception {
		return this.findByCriteria("isbn", isbn);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.Customer.portlet.repository.CustomerInMemoryDAO#getCustomer(int)
	 */
	@Transactional
	public DBCustomer getCustomer(int id) throws Exception {
		return this.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.Customer.portlet.repository.CustomerInMemoryDAO#deleteCustomer(int)
	 */
	@Transactional
	public void deleteCustomer(int id) throws Exception {
		DBCustomer Customer = this.findById(id);
		if(Customer != null){
			this.delete(Customer);
		}
	}
	/* (non-Javadoc)
	 * @see com.xtivia.Customer.portlet.repository.CustomerInMemoryDAO#addCustomer(com.xtivia.Customer.portlet.entity.Customer)
	 */
	@Transactional
	public void addCustomer(DBCustomer customer) throws Exception {
		this.save(customer);		
	}

	/* (non-Javadoc)
	 * @see com.xtivia.Customer.portlet.repository.CustomerInMemoryDAO#updateCustomer(com.xtivia.Customer.portlet.entity.Customer)
	 */
	@Transactional
	public void updateCustomer(DBCustomer customer) throws Exception {
		this.saveOrUpdate(customer);
		
	}

}
