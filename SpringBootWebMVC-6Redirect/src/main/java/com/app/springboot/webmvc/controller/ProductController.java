package com.app.springboot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

	@GetMapping("/delete")
	public String removeProduct(
			@RequestParam Integer pid, RedirectAttributes attributes) 
	{
		String msg="Product Deleted :"+pid;
		System.out.println("From Delete Product Method");
		attributes.addAttribute("message",msg);
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String showProducts(@RequestParam(required=false) String message, Model model)
	{
		System.out.println("From All Products Method");
		model.addAttribute("msg",message);
		return "ProductPage";
	}
}
