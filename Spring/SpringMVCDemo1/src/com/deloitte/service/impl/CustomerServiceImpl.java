package com.deloitte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.dao.CustomerDAO;
import com.deloitte.model.Customer;
import com.deloitte.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public boolean addCustomer(Customer customer) {
		System.out.println("Customer Service AddCustomer");
		if (customer.getBillAmount() > 0)
			return customerDAO.addCustomer(customer);
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		System.out.println("Customer Service updateCustomer");
		if (customer.getBillAmount() > 0)
			return customerDAO.updateCustomer(customer);
		return false;
	}

	@Override
	public boolean deleteCustomer(int customer) {
		System.out.println("Customer Service deleteCustomer");
		return customerDAO.deleteCustomer(customer);
	}

	@Override
	public List<Customer> listCustomer() {
		System.out.println("Customer Service listCustomer");
		return customerDAO.listCustomer();
	}

	@Override
	public Customer findCustomer(int customerId) {
		System.out.println("Customer Service findCustomer");
		return customerDAO.findCustomer(customerId);
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		System.out.println("Customer Service isCustomerExists");
		return customerDAO.isCustomerExists(customerId);
	}

}
