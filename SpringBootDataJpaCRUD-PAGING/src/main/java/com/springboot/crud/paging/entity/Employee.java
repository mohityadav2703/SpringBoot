package com.springboot.crud.paging.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employee_data")
@NoArgsConstructor
@AllArgsConstructor 
public class Employee {
	
	@Id
	@Column(name="id")
	private Integer eId;
	private String name;
	private Double salary;
	
}
