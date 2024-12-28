package com.app.springboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Department;
import com.app.springboot.entity.Employee;
import com.app.springboot.repository.DepartmentRepository;
import com.app.springboot.repository.EmployeeRepository;

@Component
public class TestOperation implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;

	@Autowired
	private DepartmentRepository drepo;
	
	public void run(String... args) throws Exception {
		Department d1=new Department(101,"Dev","XYZ");
		drepo.save(d1);
		
		Employee e1=new Employee(10,"Mohit",300.0,d1);
		Employee e2=new Employee(11,"Nihit",500.0,d1);
		Employee e3=new Employee(12,"Divisha",450.0,d1);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		
		
	}

}
