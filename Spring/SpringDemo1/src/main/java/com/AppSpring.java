package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppSpring {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
//		Customer customer = (Customer)factory.getBean("cust");
		Customer customer = (Customer)factory.getBean("cust");
		
//		
//        customer.setCustomerName("Abhishek");
        System.out.println(customer);
	}
	
}
