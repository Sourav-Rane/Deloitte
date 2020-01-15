package com.pms.deloitte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
//@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct(Product product) {
		System.out.println("####### Product Controller => saveProduct");
		ModelAndView view = new ModelAndView("redirect:/product");
		view.addObject("product", new Product());
		productService.addProduct(product);
		System.out.println(product);
		return view;

	}

//	@RequestMapping("/updateProduct")
//	public ModelAndView updateProduct(Product product) {
//		System.out.println("####### Product Controller updateProduct");
//		ModelAndView view = new ModelAndView("redirect:/product");
//		productService.updateProduct(product);
//		return view;
//
//	}

	@RequestMapping("/editProduct/{prodId}")
	public ModelAndView editProduct(@PathVariable("prodId")Integer productId) {
		System.out.println("####### Product Controller editProduct");
		ModelAndView view = new ModelAndView("productForm");
		Product product = productService.getProduct(productId);
		List<Product> allProducts = productService.listProducts();
		view.addObject("product", product);
		view.addObject("allProduct", allProducts);
		return view;

	}
	
	
	@RequestMapping(value = "/editProduct/add/update")
	public String updateProduct(Product product) {
		System.out.println("####### Product Controller updateProductEdit");
		productService.updateProduct(product);
		return "redirect:/product";

	}
	
	
	

//	 @RequestMapping("/deleteProduct") public ModelAndView deleteProduct(Product
//	  product) { System.out.println("Product Controller deleteProduct");
//	  ModelAndView view = new ModelAndView("redirect:/product");
//	  productService.deleteProduct(product.getProductId()); return view;
//	  
//	  }
	
	@RequestMapping("/deleteProduct/{prodId}")
	public ModelAndView deleteProduct(@PathVariable("prodId") Integer productId) {
		System.out.println("####### Product Controller deleteProduct");
		ModelAndView view = new ModelAndView("redirect:/product");
		productService.deleteProduct(productId);
		return view;

	}

	@RequestMapping("/viewProduct")
	public ModelAndView viewProduct() {
		System.out.println("####### Product Controller viewProduct");
		ModelAndView view = new ModelAndView("productView");
		return view;

	}

	@RequestMapping("/product")
	public ModelAndView productForm() {
		System.out.println("####### Product Controller productForm");
		ModelAndView view = new ModelAndView("productForm");
		view.addObject("product", new Product());
		List<Product> allProducts = productService.listProducts();
		view.addObject("allProduct", allProducts);
		return view;

	}
}
