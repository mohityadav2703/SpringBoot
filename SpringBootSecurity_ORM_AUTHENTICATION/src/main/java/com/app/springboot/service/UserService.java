package com.app.springboot.service;

import java.util.Optional;

import com.app.springboot.entity.User;

public interface UserService {
	
	public Integer saveUser(User user);
	public Optional<User> findByUserEmail(String userEmail);
}
