package com.app.springboot.service;

import java.util.List;

import com.app.springboot.entity.Student;

public interface StudentService {

	Integer saveStudent(Student student);
	List<Student> getAllStudents();
	Student getOneStudent(Integer id);
	void updateStudent(Student student);
	void deleteStudent(Integer id);
	
}
