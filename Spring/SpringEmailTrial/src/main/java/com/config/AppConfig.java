package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.impl.Body;
import com.impl.Email;
import com.impl.From;
import com.impl.Subject;
import com.impl.To;



@Configuration
public class AppConfig {

	@Bean
	public Email getEmail() {
		return new Email();
	}
	
	@Bean
	public To getTo() {
		return new To();
		
	}
	
	@Bean
	public From getFrom() {
		return new From();
	}
	
	
	@Bean
	public Subject getSubject() {
		return new Subject();
	}
	
	@Bean
	public Body getBody() {
		return new Body();
	}
}
