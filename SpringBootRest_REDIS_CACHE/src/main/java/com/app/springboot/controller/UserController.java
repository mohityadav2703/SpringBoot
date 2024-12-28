package com.app.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.springboot.entity.User;
import com.app.springboot.service.UserService;

@RestController
@RequestMapping("v1/api/user")
public class UserController {
	
	@Autowired
	private UserService service;

	@PostMapping("/save")
	public String saveUser(@RequestBody User user) {
		service.saveUser(user);
		return "User Created";
	}
	
	@GetMapping("/find/{id}")
	public User getUser(@PathVariable Integer id) {
		return service.getOneUser(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		service.deleteOneUser(id);
		return "User Deleted";
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody User user) {
		service.updateUser(user.getId(), user);
		return "User Updated";
	}
}
