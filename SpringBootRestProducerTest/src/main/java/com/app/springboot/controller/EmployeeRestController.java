package com.app.springboot.controller;

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

import com.app.springboot.controller.bean.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

//	@GetMapping("/showA") 
//	public ResponseEntity<String> showMsgA(){
//		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
//	}
	
	@GetMapping("/showA/{id}")
	public ResponseEntity<String> showMsgA(@PathVariable String id){
		return new ResponseEntity<String>("Welcome "+id,HttpStatus.OK);
	}
	
	@PostMapping("/showB")
	public ResponseEntity<String> showMsgB(@RequestBody Employee employee){
		return new ResponseEntity<String>("Welcome Post" +employee, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/showC/{id}")
	public ResponseEntity<String> showMsgC(@PathVariable String id){
		return new ResponseEntity<String>("Delete" +id, HttpStatus.OK);
	}
	
	@PutMapping("/showD")
	public ResponseEntity<String> showMsgD(@RequestBody Employee employee){
		return new ResponseEntity<String>("Put "+employee,HttpStatus.OK);
	}
}
