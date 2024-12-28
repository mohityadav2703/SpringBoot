package com.springboot.crud.jparepo.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="ProductTab")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name="pname")
	private String prodName;
	
	@ElementCollection
	@CollectionTable(name="prod_vendors", joinColumns = @JoinColumn(name="pidFK"))
	@Column(name="vendor")
	private Set<String> vendors;
	
	@ElementCollection
	@CollectionTable(name="prod_versions" ,joinColumns = @JoinColumn(name="pidFK"))
	@OrderColumn(name="index_Position")
	@Column(name="version")
	private List<String> versions;
	
	@ElementCollection
	@CollectionTable(name="prod_clients", joinColumns = @JoinColumn(name="pidFK"))
	@MapKeyColumn(name="Key_code")
	@Column(name="Value_name")
	private Map<String,String> clients;
	

}
