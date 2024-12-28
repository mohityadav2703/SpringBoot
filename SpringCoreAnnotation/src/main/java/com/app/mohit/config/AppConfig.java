package com.app.mohit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app.mohit.*")
@PropertySource("classpath:myapp.properties")
public class AppConfig {
	

}
