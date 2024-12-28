package com.springboot.app.autowired.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.app.autowired.bean.Publisher;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private Publisher publish;
	
	public void run(String... args) throws Exception {
		System.out.println(publish);
		
		
	}

}
