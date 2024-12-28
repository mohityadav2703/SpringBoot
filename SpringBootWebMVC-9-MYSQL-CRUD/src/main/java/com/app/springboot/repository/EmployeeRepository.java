package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
