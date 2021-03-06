package com.pms.deloitte.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

public class ProductDAOImpl implements ProductDAO {

	Configuration configuration = null;
	SessionFactory factory =null;
	
	public ProductDAOImpl() {
		configuration = new Configuration().configure();
		factory = configuration.buildSessionFactory();
	}

	@Override
	public boolean addProduct(Product product) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(product);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.update(product);
		
		transaction.commit();
		session.close();
		return false;
	}
	

	@Override
	public boolean deleteProduct(int productId) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Product product = new Product();
		product.setProductId(productId);
		session.delete(product);
		
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public List<Product> listProduct() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Product" );
		List<Product> allProduct = query.list();
		session.close();
		return allProduct;
	}

	@Override
	public Product findProduct(int productId) {
		Session session = factory.openSession();
		Product product = (Product) session.get(Product.class, productId);
		session.close();
		
		return product;
	}

	@Override
	public boolean isProductExists(int productId) {
		Session session = factory.openSession();
		Product product = (Product) session.get(Product.class, productId);
		session.close();
		if(product == null)
			return false;
		return true;
	}

	@Override
	public List<Product> filterProduct(int price) {
		Session session = factory.openSession();
		Query query = session.createQuery("select c.productName from Product c where c.price > "+price);
		List<Product> filterProduct = query.list();
		session.close();
		return filterProduct;
	}

	
	
		
	
	
}


