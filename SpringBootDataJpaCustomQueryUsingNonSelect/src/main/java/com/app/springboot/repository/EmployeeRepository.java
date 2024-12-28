package com.app.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.springboot.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query(value="select E.eName, E.eSal from EmpTab E", nativeQuery = true)
	List<Object[]> getData();
	
	@Transactional
	@Modifying
	@Query("update Employee e set e.empSal=:esal where e.empName=:ename")
	int updateSalByName(Double esal,String ename);

}
