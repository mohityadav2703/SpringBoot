package com.app.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumerCartService {

	@Autowired
	private DiscoveryClient client;
	
	public String getCartData() {
		//make call to EUREKA to get service Instance
		List<ServiceInstance> list=client.getInstances("CART-SERVICE");
		ServiceInstance si=list.get(0);
		
		//create url
		String url=si.getUri()+"/cart/message";
		
		//use RestTemplate to make http call to cart MS
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> re=template.getForEntity(url, String.class);
		
		//return response
		return re.getBody();
	}
}
