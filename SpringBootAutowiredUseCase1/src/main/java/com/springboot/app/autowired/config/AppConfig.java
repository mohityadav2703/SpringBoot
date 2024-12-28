package com.springboot.app.autowired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.springboot.app.autowired.bean.Book;

@Configuration
public class AppConfig {
	
	@Bean
	public Book pub() {
		Book b1=new Book();
		b1.setBookName("JAVA");
		b1.setPrice(340.99);
		return b1;
	}
	
	@Bean
	@Primary
	public Book pub1() {
		Book b2=new Book();
		b2.setBookName("ORACLE");
		b2.setPrice(599.98);
		return b2;
	}
	
}
