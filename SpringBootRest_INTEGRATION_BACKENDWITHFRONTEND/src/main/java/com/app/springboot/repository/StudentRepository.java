package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
