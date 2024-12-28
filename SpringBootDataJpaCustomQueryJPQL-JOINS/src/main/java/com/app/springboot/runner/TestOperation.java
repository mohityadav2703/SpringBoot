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
	private EmployeeRepository empRepo;

	@Autowired
	private DepartmentRepository deptRepo;
	
	public void run(String... args) throws Exception {
		
		Department d1=new Department(101,"DEV","XYZ");
		Department d2=new Department(102,"QA","MMM");
		Department d3=new Department(103,"BA","PPP");
		Department d4=new Department(104,"ART","XYZ");
		Department d5=new Department(105,"ITHD","OUY");
		
		deptRepo.save(d1);
		deptRepo.save(d2);
		deptRepo.save(d3);
		deptRepo.save(d4);
		deptRepo.save(d5);
		
		Employee e1=new Employee(10,"SAM",200.00,null);
		Employee e2=new Employee(11,"SYED",300.00,d2);
		Employee e3=new Employee(12,"AJAY",400.00,d3);
		Employee e4=new Employee(13,"AHMED",500.00,null);
		Employee e5=new Employee(14,"KHAN",600.00,null);
		
		empRepo.save(e1);
		empRepo.save(e2);
		empRepo.save(e3);
		empRepo.save(e4);
		empRepo.save(e5);
		
	//	empRepo.fetchEmpNameAndDeptCode().stream().map(k -> k[0]+" "+k[1]).forEach(System.out::println);
	//	empRepo.fetchAllEmpNameAndDeptCode().stream().map(k1 -> k1[0]+" "+k1[1]).forEach(System.out::println);
		empRepo.fetchEmpNameAndAllDeptCode().stream().map(k2 -> k2[0]+" "+k2[1]).forEach(System.out::println);
	//	empRepo.fetchEmpNameAndAllDeptCode().stream().map(k3 -> k3[0]+" "+k3[1]).forEach(System.out::println);
		
	}

}
