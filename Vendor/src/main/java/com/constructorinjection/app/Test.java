package com.constructorinjection.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		Product pob=(Product) ac.getBean("pobj");
		System.out.println(pob);
		
		Vendor vnd=ac.getBean("vender", Vendor.class);
		System.out.println(vnd);
		
	}

}
