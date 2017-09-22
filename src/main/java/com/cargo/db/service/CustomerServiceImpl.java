package com.cargo.db.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargo.db.base.BaseDAO;
import com.cargo.db.base.BaseService;
import com.cargo.db.entity.DBCustomer;
import com.cargo.db.repository.CustomerDAO;

/**
 * @author created by dtran
 * A Service implementation
 */
@Service("customerService")
@Transactional
public class CustomerServiceImpl extends BaseService<DBCustomer, BaseDAO> implements CustomerService{

	@Autowired(required = true)
	CustomerDAO customerDAO;
	
	public CustomerServiceImpl(){}
	
	/* (non-Javadoc)
	 * @see com.xtivia.customer.portlet.service.CustomerService#getCustomerList()
	 */
	public List<DBCustomer> getCustomerList() throws Exception {
		return customerDAO.getCustomerList();
	}

	/* (non-Javadoc)
	 * @see com.xtivia.customer.portlet.service.CustomerService#getCustomerList(java.lang.String)
	 */
	public List<DBCustomer> getCustomerList(String isbn) throws Exception {
		return customerDAO.getCustomerList(isbn);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.customer.portlet.service.CustomerService#getCustomer(int)
	 */
	public DBCustomer getCustomer(int id) throws Exception {
		return customerDAO.getCustomer(id);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.customer.portlet.service.CustomerService#deleteCustomer(int)
	 */
	public void deleteCustomer(int id) throws Exception {
		customerDAO.deleteCustomer(id);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.customer.portlet.service.CustomerService#addCustomer(com.xtivia.customer.portlet.entity.Customer)
	 */
	public void addCustomer(DBCustomer customer) throws Exception {
		customerDAO.addCustomer(customer);
	}

	/* (non-Javadoc)
	 * @see com.xtivia.customer.portlet.service.CustomerService#update(com.xtivia.customer.portlet.entity.Customer)
	 */
	public void update(DBCustomer customer) throws Exception {
		customerDAO.updateCustomer(customer);		
	}

}
