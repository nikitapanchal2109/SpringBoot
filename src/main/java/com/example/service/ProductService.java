package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductService {
	
	Product findProduct(int productId);

	boolean deleteProduct(int productId);

	boolean updateProduct(Product product);

	boolean addProduct(Product product);

	List<Product> findAllProducts();

}
