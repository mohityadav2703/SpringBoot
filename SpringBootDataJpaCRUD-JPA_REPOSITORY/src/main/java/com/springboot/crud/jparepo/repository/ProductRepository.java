package com.springboot.crud.jparepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.jparepo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
