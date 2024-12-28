package com.spring.jsr.annotation.configuration.lifecycle.method.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.jsr.annotation.configuration.lifecycle.method.bean.ExcelExport;
import com.spring.jsr.annotation.configuration.lifecycle.method.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ExcelExport ee=context.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ee);
		context.close();
	}

}
