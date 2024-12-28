package com.hibernate.with.data.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hibernate.with.data.jpa.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {

	
	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
	}

	
	
	
}
