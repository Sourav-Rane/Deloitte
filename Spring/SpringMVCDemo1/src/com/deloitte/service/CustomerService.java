package com.deloitte.service;

import java.util.List;

import com.deloitte.model.Customer;

public interface CustomerService {
	public boolean addCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomer(int customer);

	public List<Customer> listCustomer();

	public Customer findCustomer(int customerId);

	public boolean isCustomerExists(int customerId);


}

