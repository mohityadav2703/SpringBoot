package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
