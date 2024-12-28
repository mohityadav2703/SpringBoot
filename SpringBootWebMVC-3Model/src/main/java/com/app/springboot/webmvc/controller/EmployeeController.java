package com.app.springboot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.springboot.webmvc.bean.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/show")
	public String showData(Model model) {
		System.out.println(model.getClass().getName());
		model.addAttribute("eid", 101);
		model.addAttribute("ename", "Mohit Kumar");
		model.addAttribute("esal", 150000.00);
		Employee emp=new Employee(55,"DD",9999.00);
		model.addAttribute("empl", emp);
		return "EmpPage";
		
	}

}
