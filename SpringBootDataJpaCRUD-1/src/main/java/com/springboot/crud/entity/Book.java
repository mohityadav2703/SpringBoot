package com.springboot.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="BookDetails")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@Column(name="id")
	private Integer bookId;
	
	@Column(name="name")
	private String bookName;
	
	@Column(name="Author")
	private String bookAuthor;
	
	@Column(name="cost")
	private Double bookCost;
}
