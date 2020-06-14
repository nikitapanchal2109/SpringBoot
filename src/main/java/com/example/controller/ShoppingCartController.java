package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Product;
import com.example.service.ProductService;

@Controller
public class ShoppingCartController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/home")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/addNewProduct", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addProduct", "product", new Product());
	}

	@RequestMapping(value = "/addNewProduct", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("product") Product p) {

		productService.addProduct(p);
		List<Product> products = productService.findAllProducts();
		ModelAndView model = new ModelAndView("getProducts");
		model.addObject("products", products);
		return model;
	}

	@RequestMapping("/getProducts")
	public ModelAndView getEmployees() {
		List<Product> products = productService.findAllProducts();
		ModelAndView model = new ModelAndView("getProducts");
		model.addObject("products", products);
		return model;
	}

}
