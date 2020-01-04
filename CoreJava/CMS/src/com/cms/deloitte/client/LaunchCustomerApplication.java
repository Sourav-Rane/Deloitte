package com.cms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {

	public static void startCustomerApp() {

		CustomerDAO customerDAO = new CustomerDAOImpl();
		while (true) {
			System.out.println("\n\n#### Welcome to Customer App ####\n");
			System.out.println("#### 1.Add Customer ####");
			System.out.println("#### 2.Update Customer ####");
			System.out.println("#### 3.Delete Customer ####");
			System.out.println("#### 4.Fetch single customer ####");
			System.out.println("#### 5.List all customers####");
			System.out.println("#### 6.EXIT ####\n");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice (1-6)");
			int ch = scanner.nextInt();

			switch (ch) {

			case 1: {
				Customer customer = new Customer();
				customer.acceptCustomerDetails();
				boolean result = false;
				if (customerDAO.isCustomerExists(customer.getCustomerId()))
					System.out.println(customer.getCustomerId() + " already exits !");
				else {
					result = customerDAO.addCustomer(customer);
					System.out.println(customer.getCustomerName() + " added successfully !");
				}
				System.out.println(result);

			}
				break;

			case 2: {
				System.out.println("Please Enter the new Details");
				Customer customer = new Customer();
				customer.acceptCustomerDetails();
				if (customerDAO.isCustomerExists(customer.getCustomerId())) {
					customerDAO.updateCustomer(customer);
					System.out.println(customer.getCustomerName() + " updated succesfully");
				} else {
					System.out.println(customer.getCustomerId() + " does not exits!");
				}

			}
				break;

			case 3: {
				System.out.println("Enter the customer id to delete");
				int customerId = scanner.nextInt();
				if (customerDAO.isCustomerExists(customerId)) {
					customerDAO.deleteCustomer(customerId);
					System.out.println(customerId + " deleted succesfully");
				} else {
					System.out.println(customerId + " does not exits!");
				}

			}
				break;

			case 4: {
				System.out.println("Enter the customer id to search");
				int customerId = scanner.nextInt();

				if (customerDAO.isCustomerExists(customerId)) {
					Customer customer = customerDAO.findCustomer(customerId);
					System.out.println(customer);

				} else {
					System.out.println(customerId + " does not exits!");
				}

			}
				break;

			case 5: {
				List<Customer> allCustomers = new ArrayList<Customer>();
				allCustomers = customerDAO.listCustomer();
				System.out.println("List of all customers \n\n");
				System.out.println(allCustomers);
				System.out.println("\n");
			}
				break;

			case 6:
				System.out.println("Thanks for using my customer app");
				System.exit(0);

			default:
				System.out.println("Invalid option" + "");
			}
		}

	}
}
