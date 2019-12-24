package finanace;

import java.util.Scanner;

public class Customer {
	private int customerId ;
	private String customerName;
	private String customerAddr;
	private int billAmount = 1000;
	

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


	public String getCustomerAddr() {
		return customerAddr;
	}


	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}


	public int getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Customer c = new Customer();
		System.out.println("get all the data");
		Scanner sc = new Scanner(System.in);
		
		c.setCustomerId(sc.nextInt());
		c.setCustomerName(sc.next());
		c.setCustomerAddr(sc.next());;
		c.setBillAmount(sc.nextInt());
		
		
		
		System.out.println("Print everything ");
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		System.out.println(c.getCustomerAddr());
		System.out.println(c.getBillAmount());
		
	}



}
