package com.springboot.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.crud.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
