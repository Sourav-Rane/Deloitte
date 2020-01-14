package com.pms.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("product")
public class ProductController {

	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct() {
		ModelAndView view = new ModelAndView("productSave");
		return view;
		
	}
	
	@RequestMapping("/updateProduct")
	public ModelAndView updateProduct() {
		ModelAndView view = new ModelAndView("productUpdate");
		return view;
		
	}
	
	@RequestMapping("/deleteProduct")
	public ModelAndView deleteProduct() {
		ModelAndView view = new ModelAndView("productDelete");
		return view;
		
	}
	

	@RequestMapping("/viewProduct")
	public ModelAndView viewProduct() {
		ModelAndView view = new ModelAndView("productView");
		return view;
		
	}
}
