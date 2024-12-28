package com.springboot.autowired.usecase.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
public class Product {
	
	@Autowired(required=false)
	@Qualifier("vob2")
	private Vendor vob;

}
