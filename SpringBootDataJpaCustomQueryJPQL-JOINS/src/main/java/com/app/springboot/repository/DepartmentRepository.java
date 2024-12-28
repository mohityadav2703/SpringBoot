package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
