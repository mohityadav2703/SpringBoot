package com.app.springboot.runner;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.springboot.entity.Book;
import com.app.springboot.repository.BookRepository;

@Component
public class TestOperation implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		System.err.println("==========================================Insert Data To DataBase==========================================");
		repo.saveAll(Arrays.asList(
				new Book(10,"CORE_JAVA",200.00,"SAM","Backend"),
				new Book(11,"ADV_JAVA",300.00,"SYED","Backend"),
				new Book(12,"SPRING",500.00,"SAM","Backend"),
				new Book(13,"WEB_SERVICES",600.00,"AJAY","Backend"),
				new Book(14,"HTML CSS",100.00,"SYED","Frontend"),
				new Book(15,"JS ANGULAR",300.00,"AJAY","Backend"),
				new Book(16,"REACTJS",200.00,"SAM","Frontend"),
				new Book(17,"NODE_JS",300.00,"SAM","Frontend")
				));
		
		System.err.println("==========================================Query Without Parameter==========================================");
		repo.getAllBooks().forEach(System.out::println);
		repo.getAllBookNames().forEach(System.out::println);
//		repo.getNameAndCost().forEach(System.out::println);
		repo.getNameAndCost().stream().map(b-> b[0]+"-"+b[1]).forEach(System.out::println);
		
		System.err.println("==========================================Query With Parameter==========================================");
		repo.getDataA("WEB_SERVICES", 200.00).forEach(System.out::println);
		
		repo.getDataB("CORE_JAVA", 300.00).forEach(System.out::println);
		
		repo.getDataC("SAM").forEach(System.out::println);
		
		repo.getDataD("ALL").stream().map(ob -> ob[0]+"-"+ob[1]).forEach(System.out::println);
		
		repo.getDataE("SAM").stream().map(ob -> ob[0]+"-"+ob[1]+"/"+ob[2]).forEach(System.out::println);
	}

}
