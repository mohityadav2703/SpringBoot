package com.springautowired.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("esobj")
public class EmployeeService {
	
//	@Autowired(required=false)
	@Autowired
	private EmployeeDao dao;   //HAS-A

	@Override
	public String toString() {
		return "EmployeeService [dao=" + dao + "]";
	}
	
	
}
