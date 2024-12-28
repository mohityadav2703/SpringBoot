package com.spring.xmlconfiguration.lifecycle.method.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ExcelExport ee=context.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN MEHTOD");
		System.out.println(ee);
		
//		context.registerShutdownHook();
		context.close();
	}

}
