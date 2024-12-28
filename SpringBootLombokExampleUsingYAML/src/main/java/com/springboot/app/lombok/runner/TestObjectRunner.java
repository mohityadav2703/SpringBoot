package com.springboot.app.lombok.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.app.lombok.service.EmailService;

@Component 
public class TestObjectRunner implements CommandLineRunner {
	
	@Autowired
	private EmailService emailService;
	
	public void run(String... args) throws Exception {
		System.out.println(emailService);
		
	}

}
