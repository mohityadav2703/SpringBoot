package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Integer>{

}
