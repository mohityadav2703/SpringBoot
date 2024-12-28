package com.app.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.app.springboot.entity.User;
import com.app.springboot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public void saveUser(User user) {
		repo.save(user);
	}
	
	@Cacheable(value = "users", key = "#userId")
	public User getOneUser(Integer userId) {
		return repo.findById(userId).get();
	}
	
	@CacheEvict(value = "users", allEntries = true)
	public void deleteOneUser(Integer userId) {
		repo.deleteById(userId);
	}
	
	@CachePut(value = "users", key = "#userId")
	public void updateUser(Integer userId, User user) {
		User userDb=repo.findById(userId).get();
		userDb.setName(user.getName());
		userDb.setRole(user.getRole());
		repo.save(userDb);
	}
}
