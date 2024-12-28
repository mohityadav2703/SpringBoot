package com.app.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.springboot.entity.Student;
import com.app.springboot.exception.StudentNotFoundException;
import com.app.springboot.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/api/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody @Valid Student student){
		Integer id=service.saveStudent(student);
		return new ResponseEntity<String>("Student '"+id+"' created",HttpStatus.OK); 
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> list=service.getAllStudents();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@GetMapping("fetch/{id}")
	public ResponseEntity<?> fetchOneStudent(@PathVariable Integer id){
		ResponseEntity<?> response=null;
		try {
			Student student=service.getOneStudent(id);
			response=new ResponseEntity<Student> (student,HttpStatus.OK);
		}
		catch(StudentNotFoundException snfe) {
			snfe.printStackTrace();
			throw snfe;
		}
		return response;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		ResponseEntity<String> response=null;
		try {
			service.updateStudent(student);
			response=new ResponseEntity<String>("student '"+student.getStdId()+"' updated", HttpStatus.OK);
		}
		catch(StudentNotFoundException snfe) {
			snfe.printStackTrace();
			throw snfe;
		}
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		ResponseEntity<String> response=null;
		try {
			service.deleteStudent(id);
			response=new ResponseEntity<String>("Student '"+id+"' deleted ",HttpStatus.OK);
		}
		catch(StudentNotFoundException snfe) {
			snfe.printStackTrace();
			throw snfe;
		}
		return response;
	}
	
}
