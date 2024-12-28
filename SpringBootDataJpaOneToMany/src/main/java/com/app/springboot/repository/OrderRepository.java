package com.app.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springboot.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
