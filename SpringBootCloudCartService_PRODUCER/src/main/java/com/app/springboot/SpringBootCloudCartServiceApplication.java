package com.app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootCloudCartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudCartServiceApplication.class, args);
	}

}
