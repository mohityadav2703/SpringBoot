package com.app.springboot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	// URL: ..../find?auth=__&type=____
	@GetMapping("find")
	public String fetchBook(
	//		@RequestParam("auth") String bauth,
	//		@RequestParam(value="auth", required=false) String bauth,
			@RequestParam(value="auth",required=false,defaultValue="NONE") String bauth,
			@RequestParam String type, Model model) 
	{
		// Its take inout from url and print on console
		System.out.println(bauth);
		System.out.println(type);
		// It use to take input from url and print on browser
		model.addAttribute("inputs" , bauth+","+type);
		return "BookPage";
	}
}
