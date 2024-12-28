package com.app.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Student_Table")
public class Student {
	
	@Id
	@Column(name="sid", length = 10)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stdId;
	
	@NotBlank
	@Column(name="sname",length = 25)
	private String stdName;
	
	@Column(name="sgen",length=15)
	private String stdGen;
	
	@Column(name="scourse",length = 20)
	private String stdCourse;
	
	@Column(name="saddr",length=70)
	@NotBlank
//	@Pattern(regexp ="[A-Za-z0-9\\.\\s\\?\\-\\,]{10-200}")
	private String stdAddr;

}
