package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Employee;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	// sql : select * from emptab where esal<?
	List<Employee> findByEmpSalLessThan(Double empSal);
	
	//SQL : SELECT * FROM EMPTAB WHERE ENAME IS NOT NULL
	List<Employee> findByEmpNameIsNotNull();
	
	//SQL: SELECT * FROM EMPTAB WHERE DEPT=?
	List<Employee> findByEmpDept(String dept); //OR
	List<Employee> findByEmpDeptIs(String dept); //OR
	List<Employee> findByEmpDeptEquals(String dept);
	
	//SQL: SELECT FROM EMPTAB WHERE ENAME LIKE 'input'
	List<Employee> findByEmpNameLike(String input);
	
	//SQL: SELECT * FROM EMPTAB WHERE EID!=? OR ENAME IS NOT NULL;
	List<Employee> findByEmpIdNotOrEmpNameIsNotNull(Integer empId);

}
