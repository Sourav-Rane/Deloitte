package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class AppSpring {
	public static void main(String[] args) {
		
		
//		Resource resource = new ClassPathResource("beans.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		//need not create bean factory too...
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Customer customer = (Customer)factory.getBean("cust"); // no need of giving this name too..
		Customer customer = context.getBean(Customer.class);
	
		customer.setCustomerId(190);
        customer.setCustomerName("Abhishek");
        customer.setCustomerAddress("Pune");
        customer.setBillAmount(1000);
        
//        ContactDetails contactDetails = context.getBean(ContactDetails.class);
//        
//        contactDetails.setEmail("abhi@gmail.com");
//        contactDetails.setMobileNumber("939383");
        
//        customer.setContactDetails(contactDetails);
        
        System.out.println(customer);
	}
	
}
