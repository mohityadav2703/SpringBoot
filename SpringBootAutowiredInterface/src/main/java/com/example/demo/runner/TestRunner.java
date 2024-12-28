package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.EmployeeService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeService service;
	
	public void run(String... args) throws Exception {
		System.out.println(service);
		
		
	}

}
