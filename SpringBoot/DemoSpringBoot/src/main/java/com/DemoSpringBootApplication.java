package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@Controller
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}
	
	
	/*
	 * @RequestMapping("/Welcome") public String sayHello() { return "mohan"; }
	 * 
	 * @RequestMapping("/sourav") public String saySourav() { return "rane"; }
	 * 
	 */
}