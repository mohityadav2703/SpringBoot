package com.app.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/message")
	public ResponseEntity<String> showCartMessage(){
		return ResponseEntity.ok("From cart Service "+port);
	}
}
