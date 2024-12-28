package com.app.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_Tab")
public class Student {

	@Id
	@Column(name="sid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stdId;
	
	@Column(name="sname",length=25)
	private String stdName;
	
	@Column(name="sgen", length=15)
	private String stdGen;
	
	@Column(name="scourse", length=20)
	private String stdCourse;
	
	@Column(name="saddr", length=180)
	private String stdAddr;
	
}
