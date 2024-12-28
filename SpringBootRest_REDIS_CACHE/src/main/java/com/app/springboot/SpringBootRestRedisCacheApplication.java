package com.app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRestRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestRedisCacheApplication.class, args);
	}

}
