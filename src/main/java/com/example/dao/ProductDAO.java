package com.example.dao;

import org.springframework.stereotype.Repository;

import com.example.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	
}
