package com.app.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerCartService {

	@Autowired
	private LoadBalancerClient client;
	
	
	public String getCartData() {
		
		//get instance from eureka
		ServiceInstance si=client.choose("CART-SERVICE");
		
		//create url
		String url=si.getUri()+"/cart/message";
		
		//create restTemplate to Http call
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> re=rt.getForEntity(url, String.class);
		return re.getBody();
	}
}
