package com.pms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.dao.impl.ProductDAOImpl;
import com.pms.deloitte.model.Product;

public class LaunchProductApplication {

	public static void startCustomerApp() {
		ProductDAO productDAO = new ProductDAOImpl();
		
		while (true) {
			System.out.println("\n\n#### Welcome to Product App ####\n");
			System.out.println("#### 1.Add Product ####");
			System.out.println("#### 2.Update Product ####");
			System.out.println("#### 3.Delete Product ####");
			System.out.println("#### 4.Fetch single Product ####");
			System.out.println("#### 5.List all Product####");
			System.out.println("#### 6.List all Product ( by price )####");

			System.out.println("#### 8.EXIT ####\n");

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your choice (1-6)");
			int ch = scanner.nextInt();

			switch (ch) {

			case 1: {
				Product product = new Product();
				product.acceptProductDetails();
				boolean result = false;
				if (productDAO.isProductExists(product.getProductId()))
					System.out.println(product.getProductId() + " already exits !");
				else {
					result = productDAO.addProduct(product);
					System.out.println(product.getProductName() + " added successfully !");
				}
				System.out.println(result);

			}
				break;

			case 2: {
				System.out.println("Please Enter the new Details");
				Product product = new Product();
				product.acceptProductDetails();
				if (productDAO.isProductExists(product.getProductId())) {
					productDAO.updateProduct(product);
					System.out.println(product.getProductName() + " updated succesfully");
				} else {
					System.out.println(product.getProductId() + " does not exits!");
				}

			}
				break;

			case 3: {
				System.out.println("Enter the product id to delete");
				int productId = scanner.nextInt();
				if (productDAO.isProductExists(productId)) {
					productDAO.deleteProduct(productId);
					System.out.println(productId + " deleted succesfully");
				} else {
					System.out.println(productId + " does not exits!");
				}

			}
				break;

			case 4: {
				System.out.println("Enter the customer id to search");
				int productId = scanner.nextInt();

				if (productDAO.isProductExists(productId)) {
					Product customer = productDAO.findProduct(productId);
					System.out.println(customer);

				} else {
					System.out.println(productId + " does not exits!");
				}


			}
				break;

			case 5: {
				List<Product> allProduct = new ArrayList<Product>();
				allProduct = productDAO.listProduct();
				System.out.println("List of all products \n\n");
				System.out.println(allProduct);
				System.out.println("\n");
			}
				break;
				
			case 6:{
				System.out.println("Please enter amount to search");
				int price = scanner.nextInt();
				List<Product> product = productDAO.filterProduct(price);
				System.out.println(product);				
			}break;
			
			
			case 7:{
				
			}break;

			case 8:
				System.out.println("Thanks for using my customer app");
				System.exit(0);

			default:
				System.out.println("Invalid option" + "");
			}
		}
		
	}
}
