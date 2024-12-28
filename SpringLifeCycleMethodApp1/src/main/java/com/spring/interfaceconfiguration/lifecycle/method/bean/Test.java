package com.spring.interfaceconfiguration.lifecycle.method.bean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ExcelExport ee=context.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		
//		context.registerShutdownHook();  //old style
		context.close();
	}
}
