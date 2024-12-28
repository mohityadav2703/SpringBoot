package com.app.springboot.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Product;
import com.app.springboot.repository.ProductRepository;

@Component
public class TestObject implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		Product p1=new Product(101,"PEN",new Date(),new Date(),new Date());
		repo.save(p1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
		String dte=sdf.format(new Date());
		System.out.println(dte);
	}

}
