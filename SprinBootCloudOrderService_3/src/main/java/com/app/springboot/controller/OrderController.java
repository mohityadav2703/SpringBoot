package com.app.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.bean.CartInfo;
import com.app.springboot.service.CartConsumerService;

@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

	@Autowired
	private CartConsumerService consumer;
	
	@GetMapping("/data")
	public ResponseEntity<String> showOrderData(){
		ResponseEntity<String> response=consumer.cartData();
		return ResponseEntity.ok("FROM ORDER SERVICE "+response.getBody());
	}
	
	@GetMapping("/info/{}")
	public ResponseEntity<String> showInfo(){
		ResponseEntity<CartInfo> response1=consumer.getInfo("TEST");
		return ResponseEntity.ok("FROM ORDER SERVICE "+response1.getBody());
	}
}
