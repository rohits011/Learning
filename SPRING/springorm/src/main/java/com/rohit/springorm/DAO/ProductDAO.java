package com.rohit.springorm.DAO;

import java.util.List;

import com.rohit.springorm.entity.Product;

public interface ProductDAO {

	int create(Product p);
	void update(Product p);
	void delete(Product p);
	Product find(int id);
	List<Product> findAll();
	
	
	
}
