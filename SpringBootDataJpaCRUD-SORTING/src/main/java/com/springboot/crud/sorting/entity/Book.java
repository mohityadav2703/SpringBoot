package com.springboot.crud.sorting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Book_Data")
@NoArgsConstructor
@AllArgsConstructor 
public class Book {

	@Id
	private Integer id;
	private String name;
	private String author;
	private Double cost;
}
