package com.springboot.crud.paging.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.springboot.crud.paging.entity.Employee;
import com.springboot.crud.paging.repository.EmployeeRepository;

@Component
public class TestOperation implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList(
					new Employee(101,"ABC",250.00),
					new Employee(102,"XYZ",300.00),
					new Employee(103,"KLM",700.50),
					new Employee(104,"PQR",850.90),
					new Employee(105,"CDE",350.00),
					new Employee(106,"JKL",270.70),
					new Employee(107,"RST",250.90),
					new Employee(108,"MBA",280.00),
					new Employee(109,"MSC",1000.00),
					new Employee(110,"MCA",250.00)
				));
	// PageRequest.of(1,3)=>(page number(1) & size of that page(3))means every page size is 3								
		Pageable pageable=PageRequest.of(1, 3);
		Page<Employee> page=repo.findAll(pageable);  // A page is a sublist of a list of objects.
		List<Employee> list=page.getContent();
		list.forEach(System.out::println);
		
		//EXTRA META DATA TO DECLARE
		System.out.println("FIRST ?"+page.isFirst());
		System.out.println("LAST ?"+page.isLast());
		System.out.println("NEXT ?"+page.hasNext());
		System.out.println("PREVIOUS ?"+page.hasPrevious());
		System.out.println("TOTAL PAGES ?"+page.getTotalPages());
		System.out.println("CURRENT PAGE ?"+page.getNumber());
		System.out.println("SIZE ?"+page.getSize());
		System.out.println("TOTAL ROWS ?"+page.getTotalElements());
	}

}
