package com.app.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="profileTab")
public class Profile {

	@Id
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name="pcode")
	private String actCode;
	
	@Column(name="pdsg")
	private String design;
}
