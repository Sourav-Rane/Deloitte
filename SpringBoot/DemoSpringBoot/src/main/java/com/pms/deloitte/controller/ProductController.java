package com.pms.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.model.Product;

@Controller
//@RequestMapping("product")
public class ProductController {

	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct(Product product) {
		ModelAndView view = new ModelAndView("productForm");
		view.addObject("command",new Product());
		System.out.println(product);
		return view;
		
	}
	
	@RequestMapping("/updateProduct")
	public ModelAndView updateProduct() {
		System.out.println("Product Controller updateProduct");
		ModelAndView view = new ModelAndView("productUpdate");
		return view;
		
	}
	
	@RequestMapping("/deleteProduct")
	public ModelAndView deleteProduct() {
		System.out.println("Product Controller deleteProduct");
		ModelAndView view = new ModelAndView("productDelete");
		return view;
		
	}
	

	@RequestMapping("/viewProduct")
	public ModelAndView viewProduct() {
		System.out.println("Product Controller viewProduct");
		ModelAndView view = new ModelAndView("productView");
		return view;
		
	}
	
	

	@RequestMapping("/product")
	public ModelAndView productForm() {
		System.out.println("Product Controller productForm");
		ModelAndView view = new ModelAndView("productForm");
		view.addObject("command", new Product());
		return view;
		
	}
}
