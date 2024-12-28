package com.app.springboot.configuration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String pwd=encoder.encode("123");
		System.out.println(pwd);
	}
}
