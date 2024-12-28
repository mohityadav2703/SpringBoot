package com.app.springboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Employee;
import com.app.springboot.repository.EmployeeRepository;

@Component
public class TestQueryRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		
		Employee emp= new Employee();
		emp.setEmpName("MOHIT");
		emp.setEmpDept("DEV");
		emp.setEmpSal(300.00);
		emp.setEmpId(8806);
		repo.save(emp);
	}

}
