package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
