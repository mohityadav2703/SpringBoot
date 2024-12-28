package com.springboot.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor 
public class Book {
	
	@Id
	private Integer id;
	private String name;
	private String author;
	private Double cost;

}
