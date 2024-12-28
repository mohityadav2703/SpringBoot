package com.app.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springboot.entity.Student;
import com.app.springboot.exception.StudentNotFoundException;
import com.app.springboot.repository.StudentRepository;
import com.app.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository repo;
	
	public Integer saveStudent(Student student) {
		Integer id=repo.save(student).getStdId();
		return id;
	}

	public List<Student> getAllStudents() {
		List<Student> list=repo.findAll();
		return list;
	}

	public Student getOneStudent(Integer id) {
		return repo.findById(id).orElseThrow(()-> new StudentNotFoundException("student '"+id+"' not Exist"));
	}
	
	public void updateStudent(Student student) {
		if(student.getStdId()==null || !repo.existsById(student.getStdId())) throw new StudentNotFoundException("student '"+student.getStdId()+"' not exist");
		else
			repo.save(student);
	}

	public void deleteStudent(Integer id) {
		repo.deleteById(id);

	}

}
