package com.springboot.app.yaml.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.app.yaml.bean.MyDbCon;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private MyDbCon con;
	
	public void run(String... args) throws Exception {
		System.out.println(con);
		
	}

}
