package com.hibernate.with.data.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="EmpDetails")
public class Employee {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column (name="ename")
	private String name;
	@Column (name="esal")
	private Double sal;

}
