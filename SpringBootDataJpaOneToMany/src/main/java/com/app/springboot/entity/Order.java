package com.app.springboot.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ordTab")
public class Order {

	@Id
	@Column(name="oid")
	private Integer ordId;
	
	@Column(name="omode")
	private String ordMode;
	
	@Column(name="odisc")
	private Double orddisc;
	
	@OneToMany
	@JoinColumn(name="ordIdFK")
	private List<Product> prod;
}
