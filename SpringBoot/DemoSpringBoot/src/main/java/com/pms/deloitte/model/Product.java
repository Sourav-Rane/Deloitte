package com.pms.deloitte.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "hr", name = "product101")
public class Product implements Serializable {
	
	@Id
	private int productId;
	@Column
	private String productName;
	@Column
	private int price;
	@Column
	private int qoh;

	public Product(int productId, String productName, int price, int qoh) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.qoh = qoh;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", qoh=" + qoh
				+ "]";
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
	public int getQoh() {
		return qoh;
	}
	public void setQoh(int qoh) {
		this.qoh = qoh;
	}
	
	
	
}
