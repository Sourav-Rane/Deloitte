package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppSpringMethod2 {
	public static void main(String[] args) {
		

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = (Customer)context.getBean("cust");
		Customer customer2 = (Customer)context.getBean("cust");

        System.out.println(customer);
        System.out.println(customer2);
        
        context.registerShutdownHook();
        
	}
	
}
