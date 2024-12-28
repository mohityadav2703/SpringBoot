package com.app.springboot.service;

import com.app.springboot.entity.User;

public interface UserService {

	Integer saveUser(User user);
	User findByUsername(String username);
}
