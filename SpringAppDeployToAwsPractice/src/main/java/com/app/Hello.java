package com.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/")
	public String getMessage() {
		return "Hello This App is Going to Deploy on AWS Server";
	}

}
