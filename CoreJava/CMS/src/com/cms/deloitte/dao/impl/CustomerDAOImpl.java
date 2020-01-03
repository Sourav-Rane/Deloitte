package com.cms.deloitte.dao.impl;

import java.util.List;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public boolean addCustomer(Customer customer) {

		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {

		return false;
	}

	@Override
	public boolean deleteCustomer(int customer) {

		return false;
	}

	@Override
	public List<Customer> listCustomer() {

		return null;
	}

	@Override
	public Customer findCustomer(int customerId) {

		return null;
	}

	@Override
	public boolean isCustomerExists(int customerId) {

		return false;
	}

}
