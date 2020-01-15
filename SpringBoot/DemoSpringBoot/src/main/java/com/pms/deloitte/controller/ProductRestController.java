package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductRestController {

	@Autowired
	ProductService productService;

	
	@RequestMapping("getProduct")
	public List<Product> product(){
		List<Product> allProducts=productService.listProducts();
		return allProducts;
	}
}
