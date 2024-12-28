package com.app.springboot.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboot.bean.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@GetMapping("/find")
	public ResponseEntity<Book> getOneBook(){
		Book b1= new Book(101,"Core Java",200.00);
		return new ResponseEntity<Book>(b1,HttpStatus.OK);
	}
	
	// fetch multiple data from collection
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBook(){
		return new ResponseEntity<List<Book>>(
				Arrays.asList(
						new Book(101,"Core Java",200.00),
						new Book(102,"Adv Java",300.00),
						new Book(103,"Spring",400.00),
						new Book(104,"Springboot",500.00)
						),
				HttpStatus.OK);
	}
	
	//fetch multiple data from map
	@GetMapping("/test")
	public ResponseEntity<Map<String,Book>> getMappedData(){
		return new ResponseEntity<Map<String,Book>>(
				Map.of(
						"B1",new Book(101,"Core Java",200.00),
						"B2",new Book(102,"Adv Java",300.0),
						"B3",new Book(103,"Spring",400.0),
						"B4",new Book(104,"SpringBoot",500.00)
						),
				HttpStatus.OK);
	}
	
	
}
