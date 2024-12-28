package com.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.jpa.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
	
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	@Query("select u from user u WHERE u.name =:n")
	public List<User> getUserByName(@Param("n") String name);
}
