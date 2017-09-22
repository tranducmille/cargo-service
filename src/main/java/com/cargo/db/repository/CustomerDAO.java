package com.cargo.db.repository;

import java.util.List;

import com.cargo.db.entity.DBCustomer;

/**
 * @author created by dtran
 * A DAO interface
 */
public interface CustomerDAO {

	public List<DBCustomer> getCustomerList() throws Exception;
	
	public List<DBCustomer> getCustomerList(String isbn) throws Exception;

	public DBCustomer getCustomer(int id) throws Exception ;

	public void deleteCustomer(int id) throws Exception ;

	public void addCustomer(DBCustomer customer) throws Exception;
	
	public void updateCustomer(DBCustomer customer) throws Exception;
}
