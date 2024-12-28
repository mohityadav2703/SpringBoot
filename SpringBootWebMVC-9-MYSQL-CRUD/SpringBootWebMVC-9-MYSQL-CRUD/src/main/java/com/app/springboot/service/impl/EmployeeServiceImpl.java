package com.app.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.springboot.entity.Employee;
import com.app.springboot.repository.EmployeeRepository;
import com.app.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public Integer saveEmployee(Employee e) {
		e=repo.save(e);
		return e.getEmpId();
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list=repo.findAll();
		return list;
	}

	public void deleteEmployee(Integer id) {
		repo.deleteById(id);

	}

	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt=repo.findById(id);
		if(opt.isPresent()) {
			Employee e=opt.get();
			return e;
		}
		else
		return null;
	}

	public void updateEmployee(Employee e) {
		repo.save(e);

	}

	public Page<Employee> getAllEmployees(Pageable pageable) {
		Page<Employee> page=repo.findAll(pageable);
		return page;
	}

}
