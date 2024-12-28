package com.springboot.crud.paging.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.springboot.crud.paging.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>,CrudRepository<Employee,Integer>{

}
