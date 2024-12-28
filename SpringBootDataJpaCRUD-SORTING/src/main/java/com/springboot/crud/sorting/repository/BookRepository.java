package com.springboot.crud.sorting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.sorting.entity.Book;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book,Integer>,CrudRepository<Book, Integer>{

}
