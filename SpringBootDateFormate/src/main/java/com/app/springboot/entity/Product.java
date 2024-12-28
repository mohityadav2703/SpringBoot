package com.app.springboot.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
	private Integer pId;
	
	private String pCode;
	
	@Temporal(TemporalType.DATE)
	private Date mfgDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date expDate;
	
	@Temporal(TemporalType.TIME)
	private Date exportTime;
}
