package com.app.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.springboot.bean.CartInfo;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Value("${my.app.title}")
	private String title;
	
	@GetMapping("/message")
	public ResponseEntity<String> cartMessage(){
		return ResponseEntity.ok(":: FROM CART SERVICE :"+title);
	}
	
	@GetMapping("/info/{code}")
	public ResponseEntity<CartInfo> getInfo(@PathVariable String code) {
		return ResponseEntity.ok(new CartInfo(code, 10000.0));
	}
}
