package com.app.springboot.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Order;
import com.app.springboot.entity.Product;
import com.app.springboot.repository.OrderRepository;
import com.app.springboot.repository.ProductRepository;

@Component
public class TestOperation implements CommandLineRunner {

	@Autowired
	private ProductRepository product;
	
	@Autowired
	private OrderRepository order;
	
	public void run(String... args) throws Exception {
		
		Product p1=new Product(1501,"Pen",20.0);
		Product p2=new Product(1502,"Book",150.0);
		Product p3=new Product(1503,"Copy",50.0);
		
		product.save(p1);
		product.save(p2);
		product.save(p3);
		
		Order ord=new Order(2301,"Online",5.0,Arrays.asList(p1,p2,p3));
		order.save(ord);
	}

}
