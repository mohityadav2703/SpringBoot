package com.springboot.crud.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.crud.entity.Book;
import com.springboot.crud.exception.BookNotFoundException;
import com.springboot.crud.repository.BookRepository;


@Component 
public class TestObj implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	public void run(String... args) throws Exception {
		
		Book b1=new Book(001,"JAVA","BALAGURU",1700.98);
		repo.save(b1);
		repo.save(new Book(102,"JAVA","BALAGURU SWAMI",200.98));
		repo.save(new Book(103,"AUTOMATION TESTING","XYZ",1700.59));
		repo.save(new Book(104,"DEVSECOPS","ABC",1900.99));
		
	    // save all at a time
		repo.saveAll(Arrays.asList(
				new Book(105,"ANGULAR","MNO",150.00),
				new Book(106,"C-LANG","BALAGURU",1900.98),   // insert
				new Book(106,"C++","KLM",170.99),            // update
				new Book(108,"MANUAL TESTING","PQR",700.00) 
				
				));
		
		Iterable<Book> data=repo.findAll();
		// We can display all data in three ways
		System.out.println(data);			// 1st way
		data.forEach(System.out::println);  // 2st way
		data.forEach(b->System.out.println(b)); // 3rd way
		
		System.out.println(repo.existsById(105)); 
		Optional<Book> b3=repo.findById(105);
		System.out.println(b3);
		
//		Optional<Book> opt=repo.findById(109);   //FIRST WAY TO SET CUSTOM EXCEPTION
//		if(opt.isPresent()) {
//			Book b2=opt.get();
//			System.out.println(b2);
//		}
//		else {
//			System.out.println("DATA NOT FOUND"); throw new
//			BookNotFoundException ("Book Not Exist With Id ");	
//		}
		
		Book b4=repo.findById(106).orElseThrow(				// Second Way to Set Custom Exception
				() ->new BookNotFoundException("Book Not Exist With This Specific Id")
				);
		System.out.println(b4);
		
		repo.deleteById(108);    // to delete single row 
//		repo.deleteAll();        // to delete all row
		repo.delete(b4);         // delete row as object form
		
	}

}
