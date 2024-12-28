package com.app.springboot.runner;

import java.util.List;

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
		
		repo.save(new Employee(101,"A",200.00,"DEV"));
		int count=repo.updateSalByName(300.00,"DEV");
		System.out.println(count);
		
		List<Object[]> arr=repo.getData();
		arr.stream().map(e -> e[0]+" "+e[1]).forEach(System.out::println);
		
	}

}
