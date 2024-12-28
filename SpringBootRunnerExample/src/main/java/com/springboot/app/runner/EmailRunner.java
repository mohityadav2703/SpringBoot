package com.springboot.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component 
@Order(99)
public class EmailRunner implements CommandLineRunner{

	public void run(String... args) throws Exception {
		System.out.println("From Email Runner");
		
	}

}
