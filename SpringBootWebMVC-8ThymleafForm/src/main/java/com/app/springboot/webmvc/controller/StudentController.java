package com.app.springboot.webmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.springboot.webmvc.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/edit")
	public String showEditPage(Model model) {
		Student student=new Student(101,"SAM",300.00,"SBMS");
		model.addAttribute("student", student);
		List<String> courses=Arrays.asList(
				"CoreJava","Adv.JAVA","SPRING","SPRINGBOOT","WEBSERVICES","MICROSERVICES","ANGULAR","AWS"
				);
		model.addAttribute("course", courses);
		return "UpdatedStudentForm";
	}
}
