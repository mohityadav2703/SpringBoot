package com.springboot.app.lombok.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.app.lombok.bean.ProductInfo;

@Component 
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProductInfo pInfo;
	
	public void run(String... args) throws Exception {
		System.out.println(pInfo);
		
	}

}
