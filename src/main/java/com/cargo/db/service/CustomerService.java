package com.cargo.db.service;

import java.util.List;

import com.cargo.db.entity.DBCustomer;

/**
 * @author created by dtran
 * A Service Interface
 */
public interface CustomerService {

	public List<DBCustomer> getCustomerList() throws Exception;
	
	public List<DBCustomer> getCustomerList(String isbn) throws Exception;
	
	public DBCustomer getCustomer(int id) throws  Exception;
	
	public void deleteCustomer(int id) throws Exception;
	
	public void addCustomer(DBCustomer customer) throws Exception;
	
	public void update(DBCustomer customer) throws Exception;
	
}
