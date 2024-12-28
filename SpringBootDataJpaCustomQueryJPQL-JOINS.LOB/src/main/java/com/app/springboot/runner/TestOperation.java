package com.app.springboot.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Product;
import com.app.springboot.repository.ProductRepository;

@Component
public class TestOperation implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		
		FileInputStream fis=new FileInputStream("D:/IMG/nihit.jpg");
		byte[] barr=new byte[fis.available()];
		fis.read(barr);
		
		String input="Hello Welcome ? How Are You ? Where Are You.. Congrats... Text Me When you See This Message.....";
		char[] carr=input.toCharArray();
		
		Product prod=new Product(101,"Iphone15PRO_MAX",159900.00,barr,carr);
		repo.save(prod);
		fis.close();
	}

}
