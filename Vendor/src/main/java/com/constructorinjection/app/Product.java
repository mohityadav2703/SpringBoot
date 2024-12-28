package com.constructorinjection.app;

import java.util.List;

public class Product {
	
	private String pcode;
	private String model;
	private List<String> data;
	private Vendor vob;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pcode, String model, List<String> data, Vendor vob) {
		super();
		this.pcode = pcode;
		this.model = model;
		this.data = data;
		this.vob = vob;
	}

	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", model=" + model + ", data=" + data + ", vob=" + vob + "]";
	}
	
	

}
