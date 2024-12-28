package com.app.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springboot.entity.Product;
import com.app.springboot.repository.ProductRepository;
import com.app.springboot.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	public Integer saveProduct(Product prod) {
		prod=repo.save(prod);
		return prod.getProdId();
	}

	
	public List<Product> getAllProduct() {
		List<Product> list=repo.findAll();
		return list;
	}

	public void deleteProduct(Integer id) {
		repo.deleteById(id);

	}

	public Product getOneProduct(Integer id) {
		Optional<Product> opt=repo.findById(id);
		if(opt.isPresent()) {
			Product prod=opt.get();
			return prod;
		}
		else
		return null;
	}

	public void updateProduct(Product prod) {
		repo.save(prod);

	}

}
