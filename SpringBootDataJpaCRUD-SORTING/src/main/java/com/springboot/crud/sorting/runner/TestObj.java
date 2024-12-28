package com.springboot.crud.sorting.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.springboot.crud.sorting.entity.Book;
import com.springboot.crud.sorting.repository.BookRepository;

@Component
public class TestObj implements CommandLineRunner {

	@Autowired
	private BookRepository repo;

	public void run(String... args) throws Exception {
		
		repo.saveAll(Arrays.asList(
				new Book(1,"A","ABC",10.5),
				new Book(2,"B","KLM",19.5),
				new Book(3,"C","XYZ",20.0),
				new Book(4,"D","PQR",90.2),
				new Book(5,"E","LMN",11.8),
				new Book(6,"F","SDF",27.47),
				new Book(7,"G","RST",88.4),
				new Book(8,"H","ABC",90.2),
				new Book(9,"I","JHI",10.5),
				new Book(10,"J","LMN",7.9),
				new Book(11,"K","XYZ",79.79),
				new Book(12,"L","RST",98.9),
				new Book(13,"M","ABC",79.79),
				new Book(14,"N","PQR",19.5),
				new Book(15,"O","JHI",20.0)
				));
		
		// SINGLE COLUMN SORTING :ASC
		System.err.println("========SINGLE COLUMN SORTING :ASC(COST)========");
		Sort s1=Sort.by(Direction.ASC, "cost");
		Iterable<Book> it1=repo.findAll(s1);
		it1.forEach(System.out::println);
		
		// SINGLE COLUMN SORTING :DESC
		System.err.println("========SINGLE COLUMN SORTING :DESC(COST)========");
		Sort s2=Sort.by(Direction.DESC, "cost");
		Iterable<Book> it2=repo.findAll(s2);
		it2.forEach(System.out::println);
		
		//MULTI-COLUMN SORTING :SAME TYPE (BOTH ACC/DESC)
		System.err.println("========MULTI-COLUMN SORTING :SAME TYPE ASC(COST,NAME)========");
		Sort s3=Sort.by(Direction.ASC, "cost","name");
		Iterable<Book> it3=repo.findAll(s3);
		it3.forEach(System.out::println);
		
		System.err.println("========MULTI-COLUMN SORTING :SAME TYPE DESC(COST,NAME)========");
		Sort s4=Sort.by(Direction.DESC, "cost","name");
		Iterable<Book> it4=repo.findAll(s4);
		it4.forEach(System.out::println);
		
		// MULTI-COLUMN SORTING : DIFFERENT TYPE (BOTH ACC/DESC)
		System.err.println("========MULTI-COLUMN SORTING : DIFFERENT TYPE (BOTH ACC/DESC)========");
		Sort s5=Sort.by(
					Order.asc("cost"),
					Order.desc("name")
				);
		repo.findAll(s5).forEach(System.out::println);
		
		
	}

}
