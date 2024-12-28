package com.app.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.springboot.entity.Product;
import com.app.springboot.exception.ProductNotFoundException;
import com.app.springboot.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController{
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/show")
	public String showRegister() {
		return "ProductPage";
	}

	@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product prod, Model model) {
		Integer id=service.saveProduct(prod);
		String message="Product '"+id+"' Created";
		model.addAttribute("message", message);
		return "ProductPage";
	}
	
	@GetMapping("/all")
	public String showAll(@RequestParam(required=false) String message, Model model) {
		List<Product> list=service.getAllProduct();
		model.addAttribute("list",list);
		model.addAttribute("message",message);
		return "ProductData";
	}
	
	@GetMapping("/delete")
	public String doDelete(@RequestParam Integer id,RedirectAttributes attributes) {
		try {
			service.deleteProduct(id);
			attributes.addAttribute("message","Product '"+id+"' Deleted");
		}
		catch(ProductNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
		}
		return "redirect:all";
	}

	@GetMapping("/edit")
	public String showEdit(@RequestParam(required=false) Integer id, Model model) {
		String page=null;
		try {
			Product product=service.getOneProduct(id);
			model.addAttribute("product",product);
			page="ProductEdit";
		}
		catch(ProductNotFoundException e) {
			e.printStackTrace();
			model.addAttribute("message",e.getMessage());
			page="redirect:all";
		}
		return page;
	}
	
	@PostMapping("/update")
	public String updateProduct(@ModelAttribute Product product, RedirectAttributes attributes) {
		service.updateProduct(product);
		attributes.addAttribute("message", "Product '"+product.getProdId()+"' Updated..");
		return "redirect:all";
	}
	
}
