package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDAO;
import com.example.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public Product findProduct(int productId) {
		
		return productDAO.findById(productId).get();
	}

	@Override
	public boolean deleteProduct(int productId) {
		
		Product p = productDAO.findById(productId).get();
		
		if(p != null) {
			productDAO.delete(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		Product p = productDAO.findById(product.getProductId()).get();
		
		if(p != null) {
			productDAO.save(product);
			return true;
		}
		return false;
	}

	@Override
	public boolean addProduct(Product product) {
		
		return productDAO.save(product) == product;
	}

	@Override
	public List<Product> findAllProducts() {
		
		return productDAO.findAll();
	}

}
