package com.pms.deloitte.model;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {


	private int productId;
	private String productName;
	private int price;
	private int qty;
	
	public Product(int productId, String productName, int price, int qty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qty = qty;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qty=" + qty
				+ "]\n";
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product() {
		super();
	}

	public void acceptProductDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product id : ");
		productId = scanner.nextInt();
		System.out.println("Enter product name : ");
		productName = scanner.next();
		System.out.println("Enter product price : ");
		price = scanner.nextInt();
		System.out.println("Enter product qty : ");
		qty = scanner.nextInt();
	}

	



}
