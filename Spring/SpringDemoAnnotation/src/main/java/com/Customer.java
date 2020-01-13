package com;


import java.io.Serializable;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 5191504945419843489L;
	private int customerId;
	private String customerName;
	private String customerAddress;
	
	@Autowired(required = false)
	private ContactDetails contactDetails;
	
	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Customer(int customerId, ContactDetails contactDetails) {
		super();
		System.out.println("Cons with id and contact details");
		this.customerId = customerId;
		this.contactDetails = contactDetails;
	}

	public Customer(int customerId) {
		super();
		this.customerId = customerId;
	}

	public Customer(int customerId, String customerName, String customerAddress, ContactDetails contactDetails) {
		super();
		System.out.println("4 params");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactDetails = contactDetails;
	}

	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		System.out.println("3 params");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	private int billAmount;

	public Customer() {
		System.out.println("Constructor called !");
	}

	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		System.out.println("Constructor called 4 params!");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}

	public void acceptCustomerDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer id : ");
		customerId = scanner.nextInt();
		System.out.println("Enter customer name : ");
		customerName = scanner.next();
		System.out.println("Enter customer address : ");
		customerAddress = scanner.next();
		System.out.println("Enter bill amount : ");
		billAmount = scanner.nextInt();
		scanner.close();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", contactDetails=" + contactDetails + ", billAmount=" + billAmount + "]";
	}

}

