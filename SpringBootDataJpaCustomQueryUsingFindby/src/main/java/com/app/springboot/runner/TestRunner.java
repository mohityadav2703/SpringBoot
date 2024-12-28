package com.app.springboot.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Employee;
import com.app.springboot.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		
		erepo.saveAll(Arrays.asList(
				new Employee(10,"AA",200.00,"DEV"),
				new Employee(11,"AB",400.00,"DEV"),
				new Employee(12,null,300.00,"QA"),
				new Employee(13,"AD",500.00,"QA")
				));
		//erepo.findByEmpSalLessThan(400.00).forEach(System.out::println);
		//erepo.findByEmpNameIsNotNull().forEach(System.out::println);
		//erepo.findByEmpDept("DEV").forEach(System.out::println);
		//erepo.findByEmpDeptIs("QA").forEach(System.out::println);
		//erepo.findByEmpDeptEquals("DEV").forEach(System.out::println);
		//erepo.findByEmpNameLike("A%").forEach(System.out::println);
		erepo.findByEmpIdNotOrEmpNameIsNotNull(10).forEach(System.out::println);
	}

}
