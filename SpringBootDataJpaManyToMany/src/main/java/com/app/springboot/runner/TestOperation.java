package com.app.springboot.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Course;
import com.app.springboot.entity.Student;
import com.app.springboot.repository.CourseRepository;
import com.app.springboot.repository.StudentRepository;

@Component
public class TestOperation implements CommandLineRunner {

	@Autowired
	private StudentRepository stdRepo;
	
	@Autowired
	private CourseRepository crsRepo;
	
	public void run(String... args) throws Exception {
		Course c1=new Course(10,"Core Java",2000.00);
		Course c2=new Course(11,"Adv Java",2500.00);
		Course c3=new Course(12,"SpringBoot",5000.00);
		
		crsRepo.save(c1);
		crsRepo.save(c2);
		crsRepo.save(c3);
		
		Student s1=new Student(101,"Mohit Kumar","Hyderabad",Arrays.asList(c1,c2));
		Student s2=new Student(102,"Nihit Kumar","Hyderabad",Arrays.asList(c2,c3));
		Student s3=new Student(103,"Divisha","Hyderabad",Arrays.asList(c1,c2,c3));
		
		stdRepo.save(s1);
		stdRepo.save(s2);
		stdRepo.save(s3);
		
	}

}
