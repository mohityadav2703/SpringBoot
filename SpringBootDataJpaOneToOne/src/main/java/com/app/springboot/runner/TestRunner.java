package com.app.springboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Profile;
import com.app.springboot.entity.User;
import com.app.springboot.repository.ProfileRepository;
import com.app.springboot.repository.UserRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProfileRepository profile;
	
	@Autowired
	private UserRepository user;
	
	public void run(String... args) throws Exception {
		
		Profile p1=new Profile(1650,"Active","Dev-001");
		Profile p2=new Profile(1651,"Active","Abcd-002");
		
		profile.save(p1);
		profile.save(p2);
		
		User u1=new User(4401,"Mohit Kumar","Mohit@123",p1);
		User u2=new User(4402,"Nihit Kumar","Nihit@123",p2);
		
		user.save(u1);
		user.save(u2);
	}

}
