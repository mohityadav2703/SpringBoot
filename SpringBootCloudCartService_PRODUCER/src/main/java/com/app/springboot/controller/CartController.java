package com.app.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

	@GetMapping("/message")
	public ResponseEntity<String> showCartData(){
		return ResponseEntity.ok("FROM CART SERVICE");
	}
}
