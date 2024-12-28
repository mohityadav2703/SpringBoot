package com.app.mohit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.mohit.bean.DatabaseCon;
import com.app.mohit.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		DatabaseCon db=context.getBean("dbObj",DatabaseCon.class);
		System.out.println(db);
	}

}
