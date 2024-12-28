package com.app.springboot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.springboot.webmvc.entity.Student;

@Controller
public class StudentController {

	//show form
	@GetMapping("/register")
	public String showReg() {
		return "StudentRegister";
	}
	
	//read form
	@PostMapping("/save")
	public String showData(@ModelAttribute Student student, Model model) {
		System.out.println(student);
		model.addAttribute("student", student);
		return "StudentData";
	}
}
