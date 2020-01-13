package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.impl.Body;
import com.impl.Email;
import com.impl.From;
import com.impl.Subject;
import com.impl.To;

public class Client {

	
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Email email = context.getBean(Email.class);
	To to = context.getBean(To.class);
	From from = context.getBean(From.class);
	Subject subject = context.getBean(Subject.class);
	Body body = context.getBean(Body.class);
	
	to.setToName("Sourav");
	to.setToEmail("sourav@gmail.com");
	
	from.setFromEmail("abhishek@gmail.com");
	from.setFromName("Abhishek");
	
	
    System.out.println(email);
}
}
