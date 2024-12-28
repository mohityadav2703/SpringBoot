package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//creating spring container
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		//read object
		Object ob=ac.getBean("mobj");
		
		//print data
		System.out.println(ob);
	}
}
