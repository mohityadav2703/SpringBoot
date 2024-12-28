package com.hibernate.with.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.hibernate.with.data.jpa.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
