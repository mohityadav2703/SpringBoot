package com.app.springboot.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.springboot.entity.User;
import com.app.springboot.repo.UserRepository;
import com.app.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	
	public Integer saveUser(User user) {
		user = repo.save(user);
		return user.getUserId();
	}

	public Optional<User> findByUserEmail(String userEmail) {
		return repo.findByUserEmail(userEmail);
	}
}
