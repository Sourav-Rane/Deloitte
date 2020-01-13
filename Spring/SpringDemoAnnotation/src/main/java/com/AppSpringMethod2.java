package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.AppConfig;

public class AppSpringMethod2 {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer = (Customer)context.getBean(Customer.class);
		Customer customer2 = (Customer)context.getBean(Customer.class);

		customer.setCustomerId(190);
        customer.setCustomerName("Abhishek");
        customer.setCustomerAddress("Pune");
        customer.setBillAmount(1000);
        
        
    	customer2.setCustomerId(190);
        customer2.setCustomerName("Abhishek");
        customer2.setCustomerAddress("Pune");
        customer2.setBillAmount(1000);
		
        System.out.println(customer);
        System.out.println(customer2);
        
        context.registerShutdownHook();
	}
	
}
