package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
