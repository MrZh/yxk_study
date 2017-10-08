package com.yxk.dao;

import org.springframework.stereotype.Repository;

import com.yxk.model.Product;

@Repository
public interface ProductDao {
	
	void saveProduct(Product product);
}
