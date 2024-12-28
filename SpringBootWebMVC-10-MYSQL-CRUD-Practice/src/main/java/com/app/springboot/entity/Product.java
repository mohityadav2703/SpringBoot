package com.app.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_table")
public class Product {

	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer prodId;
	
	@Column(name="pname",length=25)
	private String prodName;
	
	@Column(name="pqty",length=10)
	private Integer prodQty;
	
	@Column(name="pprice", length=10)
	private Double prodPrice;
}
