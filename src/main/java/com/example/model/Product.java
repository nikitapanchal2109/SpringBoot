package com.example.model;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_dtls")
public class Product {
	
	@Id
	private int productId;
	private String productName;
	private String productCategory;
	private int stock;
	
	public Product() {
		this.productId = new Random().nextInt(100000);
	}
	
	public Product(int product_id, String productName, String productCategory, int stock) {
		this.productId = new Random().nextInt(100000);
		this.productName = productName;
		this.productCategory = productCategory;
		this.stock = stock;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", stock=" + stock + "]";
	}
}
