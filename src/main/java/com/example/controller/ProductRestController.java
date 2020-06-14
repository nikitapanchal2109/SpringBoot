package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RequestMapping("/products")
@RestController
public class ProductRestController {

	@Autowired
	ProductService productService;

	public ProductRestController() {
		System.out.println("Product Controller created...");
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
	}
	
	@GetMapping("/{productId}")
	public Product getAllProducts(@PathVariable("productId") int productId){
		
		return productService.findProduct(productId);
	}
	
	@PostMapping
	public List<Product> addProduct(@RequestBody Product product) {
		productService.addProduct(product);
		
		return productService.findAllProducts();
	}
	
	@PutMapping("/{productId}")
	public List<Product> updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
		productService.updateProduct(product);
		
		return productService.findAllProducts();
	}
	
	@DeleteMapping("/{productId}")
	public List<Product> deleteProduct(@PathVariable("productId") int productId){
		productService.deleteProduct(productId);
		return productService.findAllProducts();
	}
}
