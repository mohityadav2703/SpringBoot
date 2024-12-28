package com.springautowired.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springautowired.app.bean.EmployeeDao;
import com.springautowired.app.bean.EmployeeService;
import com.springautowired.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService es=context.getBean("esobj",EmployeeService.class);
		System.out.println(es);
		
		EmployeeDao ed=context.getBean("edao",EmployeeDao.class);
		System.out.println(ed);
	}
	

}
