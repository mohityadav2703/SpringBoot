package com.springboot.app.lombok.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("my.book")
public class Book {
	List<Author> authors;
//	Map<String,Author> authors;
	
}
