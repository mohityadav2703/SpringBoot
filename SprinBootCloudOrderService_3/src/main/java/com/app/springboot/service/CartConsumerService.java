package com.app.springboot.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.app.springboot.bean.CartInfo;

@FeignClient("CART-SERVICE")
public interface CartConsumerService {

	@GetMapping("/cart/message")
	public ResponseEntity<String> cartData();

	@GetMapping("/cart/info/{code}")
	public ResponseEntity<CartInfo> getInfo(@PathVariable String code);
}
