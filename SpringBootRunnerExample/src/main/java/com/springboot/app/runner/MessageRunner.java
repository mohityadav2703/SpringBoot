package com.springboot.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component 
@Order(11)
public class MessageRunner implements CommandLineRunner{

	public void run(String... args) throws Exception {
		System.out.println("This Is From Message Runner");
		
	}

}
