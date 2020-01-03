package product;

import java.util.Scanner;

public class Product {

	private int prodid;
	private String prodname;
	private int prodprice;
	private int qty;
	Scanner scanner = new Scanner(System.in);

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public int getProdprice() {
		return prodprice;
	}

	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void accept() {

		System.out.println("Enter product id : ");
		prodid = scanner.nextInt();
		System.out.println("Enter product name : ");
		prodname = scanner.next();
		System.out.println("Enter product price: ");
		prodprice = scanner.nextInt();
		System.out.println("Enter qty: ");
		qty = scanner.nextInt();
	}

}
