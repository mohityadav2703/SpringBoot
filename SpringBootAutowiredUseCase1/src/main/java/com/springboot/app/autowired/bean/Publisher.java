package com.springboot.app.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Publisher {
	
	@Autowired(required=false)
	@Qualifier("pub1")
	private Book book;
}
