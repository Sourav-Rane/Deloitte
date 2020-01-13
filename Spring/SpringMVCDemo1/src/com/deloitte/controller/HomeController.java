package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/ahmed")
	public String gg() {
		return "ghosia";
	}
	
	@RequestMapping("/customer")
	public String pp() {
		return "cust";
	}
	
	@RequestMapping("/cust")
	public String customer() {
		return "customer";
	}
	
	@RequestMapping("/emp")
	public String employee() {
		return "employee";
	}
	
	@RequestMapping("/prod")
	public String product() {
		return "product";
	}
	
	
	@RequestMapping("/guest")
	public String guest() {
		return "guestpg";
	}
}
