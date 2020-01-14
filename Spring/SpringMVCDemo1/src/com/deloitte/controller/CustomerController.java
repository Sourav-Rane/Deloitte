package com.deloitte.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.dao.CustomerDAO;
import com.deloitte.dao.impl.CustomerDAOImpl;
import com.deloitte.model.Customer;
import com.deloitte.service.CustomerService;

@Controller
public class CustomerController {

//	CustomerDAO customerDAO = new CustomerDAOImpl();
	@Autowired
	CustomerService customerService;

	/*
	 * @RequestMapping("/customerSave") public String saveCustomerDetails(Customer
	 * customer) { System.out.println(customer); customerDAO.addCustomer(customer);
	 * return "result"; }
	 */

	@RequestMapping("customerSave")
	public ModelAndView saveCustomerDetails(Customer customer) {
		System.out.println("Customer Controller saveCustomerDetails");
		System.out.println(customer);
		boolean result = customerService.addCustomer(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		if(result == true)
			view.addObject("custo", customer);
		else
			view.addObject("custo", "Bill AMount cant be negative !!");
		return view;

	}

	@RequestMapping("updateCustomer")
	public ModelAndView updateCustomerDetails(Customer customer) {
		System.out.println("Customer Controller updateCustomerDetails");
		System.out.println(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");

		if (customerService.isCustomerExists(customer.getCustomerId())) {
			view.addObject("custo", customer.getCustomerName() + " has been saved successfully ! ");
			customerService.updateCustomer(customer);

		} else {
			view.addObject("custo", customer.getCustomerId() + " Does not exist !");
		}

		return view;

	}

	@RequestMapping("customerDetails")
	public ModelAndView customerDetails(HttpSession session) {
		System.out.println("Customer Controller customerDetails");
		ModelAndView view = new ModelAndView();
		view.setViewName("allCustomerRecords");
		
		List<Customer> allCustomers = customerService.listCustomer();
//		view.addObject("allCust", allCustomers);
		session.setAttribute("allCust", allCustomers);
		return view;

	}
	
	 
	@RequestMapping("fetchCustomer")
	public ModelAndView fetchCustomer(Customer customer) {
		System.out.println("Customer Controller fetchCustomer");
		ModelAndView view = new ModelAndView();
		Customer retrievedCustomer = customerService.findCustomer(customer.getCustomerId());
		view.addObject("command",retrievedCustomer);
		view.setViewName("CustomerForm");
		return view;
	}
	
	
	@RequestMapping("customerForm")
	public ModelAndView customerForm(Customer customer) {
		System.out.println("Customer Controller customerForm");
		ModelAndView view = new ModelAndView();
		view.addObject("command", new Customer());
		view.setViewName("CustomerForm");
		return view;
	}

}
