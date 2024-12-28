package com.app.springboot.service;

import java.util.List;

import com.app.springboot.entity.Product;

public interface ProductService {

	Integer saveProduct(Product prod);
	List<Product> getAllProduct();
	void deleteProduct(Integer id);
	Product getOneProduct(Integer id);
	void updateProduct(Product prod);
}
