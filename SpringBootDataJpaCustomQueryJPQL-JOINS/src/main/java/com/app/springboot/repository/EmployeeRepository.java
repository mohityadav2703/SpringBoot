package com.app.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("select E.empName,D.deptCode from Employee E inner join E.dept as D")
	List<Object[]> fetchEmpNameAndDeptCode();
	
	@Query("select E.empName,D.deptCode From Employee E left join E.dept as D")
	List<Object[]> fetchAllEmpNameAndDeptCode();
	
	@Query("select E.empName,D.deptCode From Employee E Right Join E.dept as D")
//	@Query("select E.empName,D.deptCode From Employee E full join E.dept as D")
	List<Object[]> fetchEmpNameAndAllDeptCode();
	

	
	

}
