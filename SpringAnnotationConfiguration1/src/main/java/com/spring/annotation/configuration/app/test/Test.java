package com.spring.annotation.configuration.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotation.configuration.app.bean.PdfExport;
import com.spring.annotation.configuration.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		PdfExport pe=ac.getBean("pobj",PdfExport.class);
		System.out.println(pe);
	}

}
