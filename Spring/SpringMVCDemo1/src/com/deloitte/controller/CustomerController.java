package com.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.dao.CustomerDAO;
import com.deloitte.dao.impl.CustomerDAOImpl;
import com.deloitte.model.Customer;

@Controller
public class CustomerController {
	
//	CustomerDAO customerDAO = new CustomerDAOImpl();
	@Autowired
	CustomerDAO customerDAO;
	
	/*
	 * @RequestMapping("/customerSave") public String saveCustomerDetails(Customer
	 * customer) { System.out.println(customer); customerDAO.addCustomer(customer);
	 * return "result"; }
	 */

	@RequestMapping("customerSave")
	public ModelAndView saveCustomerDetails(Customer customer) {
		System.out.println(customer);
		customerDAO.addCustomer(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		view.addObject("custo",customer);
		return view;
		
	}
	
	
	@RequestMapping("updateCustomer")
	public ModelAndView updateCustomerDetails(Customer customer) {
		System.out.println(customer);
		ModelAndView view = new ModelAndView();
		view.setViewName("result");
		
		if(customerDAO.isCustomerExists(customer.getCustomerId()))
		{
			view.addObject("custo", customer.getCustomerName()+" has been saved successfully ! ");
			customerDAO.updateCustomer(customer);
			
		}else {
			view.addObject("custo", customer.getCustomerId()+" Does not exist !");
		}
		
		return view;
		
	}
	
}
