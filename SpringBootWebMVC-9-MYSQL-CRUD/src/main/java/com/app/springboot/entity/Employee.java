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
@Table(name="employee_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eid")
	private Integer empId;
	
	@Column(name="ename", length=25)
	private String empName;
	
	@Column(name="egen", length=10)
	private String empGen;
	
	@Column(name="esal", length=15)
	private Double empSal;
	
	@Column(name="edept", length=15)
	private String empDept;
	
	@Column(name="eaddr", length=150)
	private String empAddr;

}
