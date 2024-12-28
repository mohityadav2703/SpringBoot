package com.springboot.crud.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.crud.entity.Book;
import com.springboot.crud.repository.BookRepository;

@Component

public class TestObj implements CommandLineRunner{

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		
	//	System.out.println(repo);
		
		//save one by one in db
		Book b1=new Book(101,"ORACLE","ORACLE CORP.",250.89);
		repo.save(b1);
		repo.save(new Book(102,"JAVA","BALAGURU SWAMI",200.98));
		repo.save(new Book(103,"AUTOMATION TESTING","XYZ",1700.59));
		repo.save(new Book(104,"DEVSECOPS","ABC",1900.99));
		
	    // save all at a time
		repo.saveAll(Arrays.asList(
				new Book(105,"ANGULAR","MNO",150.00),
				new Book(106,"C-LANG","BALAGURU",1900.98),
				new Book(107,"C++","KLM",170.99),
				new Book(108,"MANUAL TESTING","PQR",700.00)
				
				));
		
		Iterable<Book> data=repo.findAll();
	//	System.out.println(data);
		data.forEach(b->System.out.println(b));
		System.out.println(repo.existsById(105));
		
		
		
		
	}

	

}
