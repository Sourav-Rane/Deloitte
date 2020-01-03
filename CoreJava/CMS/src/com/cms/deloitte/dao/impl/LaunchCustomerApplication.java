package com.cms.deloitte.dao.impl;

import java.util.Scanner;

import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {

	public static void startCustomerApp() {
		System.out.println("#### Welcome to Customer App ####");
		System.out.println("#### 1.Add Customer ####");
		System.out.println("#### 2.Update Customer ####");
		System.out.println("#### 3.Delete Customer ####");
		System.out.println("#### Welcome to Customer App ####");
		System.out.println("#### 6.EXIT ####");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice (1-6)");
		int ch = scanner.nextInt();

		switch (ch) {
		case 1:
			Customer customer = new Customer();
			customer.acceptCustomerDetails();
			CustomerDAOImpl impl = new CustomerDAOImpl();
			boolean result = impl.addCustomer(customer);
			System.out.println(result);

		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Thanks for using my customer app");
			System.exit(0);
		}

	}
}
