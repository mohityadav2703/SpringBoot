package com.springannotationconfiguration.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		//find  class from package(basePackage)
		context.scan("com.springannotationconfiguration.app");
		
		//create object
		context.refresh();
		
		ExcelExport ee=context.getBean("exObj", ExcelExport.class);
		System.out.println(ee);
		
	}

}
