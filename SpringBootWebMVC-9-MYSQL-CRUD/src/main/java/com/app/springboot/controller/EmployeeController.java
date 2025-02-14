package com.app.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.springboot.entity.Employee;
import com.app.springboot.exception.EmployeeNotFoundException;
import com.app.springboot.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	//Display Registration Page
	@GetMapping("/register")
	public String showRegister() {
		return "EmployeeRegister";
	}
	
	// Read Form data and insert in Database
	@PostMapping("/save")
	public String saveForm(@ModelAttribute Employee employee, Model model) {
		Integer id=service.saveEmployee(employee);
		String message="Employee'"+id+"'Created";
		//send message to ui
		model.addAttribute("message", message);
		return "EmployeeRegister";
	}
	//fetch all data from database
	

	@GetMapping("/all")
	public String showAll(Model model) {
		List<Employee> list=service.getAllEmployee();
		//send this data to ui/view
		model.addAttribute("list", list);
	//	model.addAttribute("message", message);
		return "EmployeeData";
	}
	
	//delete based on id
	@GetMapping("/delete")
	public String doDelete(@RequestParam Integer id, RedirectAttributes attributes) {
	
		try {
			service.deleteEmployee(id);
			attributes.addAttribute("message", "Employee '"+id+"'Deleted");
		}
		catch(EmployeeNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id,Model model) {
		String page=null;
		try {
			Employee employee=service.getOneEmployee(id);
			model.addAttribute("employee",employee);
			page="EmployeeEdit";
		}
		catch(EmployeeNotFoundException e) {
			e.printStackTrace();
			model.addAttribute("message", e.getMessage());
			page="redirect:all";
		}
		return page;
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee, RedirectAttributes attributes) {
		//update form data
		service.updateEmployee(employee);
		attributes.addAttribute("message", "Employee '"+employee.getEmpId()+"' Updated...");
		return "redirect:all";
	}
	
	public String showAll(@PageableDefault(page=0, size=3) Pageable pageable,
							@RequestParam(required=false) String message,
							Model model) {
		//fetch data from database
		Page<Employee> page=service.getAllEmployees(pageable);
		//send data to UI
		model.addAttribute("list",page.getContent());
		model.addAttribute("page",page);
		model.addAttribute("message", message);
		//goto UI page
		return "EmployeeData";
	}
}
