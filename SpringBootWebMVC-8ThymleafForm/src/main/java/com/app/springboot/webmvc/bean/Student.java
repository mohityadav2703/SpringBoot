package com.app.springboot.webmvc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private Integer stdId;
	private String stdName;
	private Double stdFee;
	private String stdCourse;
}
