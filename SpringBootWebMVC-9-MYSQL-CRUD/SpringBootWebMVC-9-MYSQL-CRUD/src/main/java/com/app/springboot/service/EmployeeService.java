package com.app.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.app.springboot.entity.Employee;

public interface EmployeeService {
	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployee();
	void deleteEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee e);
	Page<Employee> getAllEmployees(Pageable pageable);
}
