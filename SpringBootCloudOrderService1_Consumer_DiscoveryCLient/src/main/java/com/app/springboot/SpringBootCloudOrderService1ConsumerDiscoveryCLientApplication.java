package com.app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootCloudOrderService1ConsumerDiscoveryCLientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudOrderService1ConsumerDiscoveryCLientApplication.class, args);
	}

}
