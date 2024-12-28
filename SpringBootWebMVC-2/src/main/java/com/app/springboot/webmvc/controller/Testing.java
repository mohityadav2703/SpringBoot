package com.app.springboot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testing {

	@RequestMapping("/emp")
	public String showEmp() {
		return "EmpPage";
	}
	
	@RequestMapping("/show")
	public String showHome() {
		return "HomePage";
	}
	
	@PostMapping("/save")
	public String saveUser() {
		return "UserPage";
	}
}
