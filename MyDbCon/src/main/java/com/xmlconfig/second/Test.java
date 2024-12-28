package com.xmlconfig.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ac= new ClassPathXmlApplicationContext("config.xml");
		JdbcOpr jdbc=ac.getBean("jdbcObj",JdbcOpr.class);
		System.out.println(jdbc);
		System.out.println(jdbc.getCon().getClass().getName());
		
		MyDbCon db=ac.getBean("dbObj",MyDbCon.class);
		System.out.println(db);
		System.out.println(db.getDriver().getClass().getPackage().getName());

	}

}
