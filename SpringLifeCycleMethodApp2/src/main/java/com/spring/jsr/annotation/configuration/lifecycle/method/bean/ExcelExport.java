package com.spring.jsr.annotation.configuration.lifecycle.method.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exObj")
public class ExcelExport {
	
	@Value("SAMPLE")
	private String fileName;
	
	@Value(".CSV")
	private String fileExt;
	
	
	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}
	
	@PostConstruct
	public void setUpA() {
		System.out.println("FROM INIT METHOD");
	}
	
	@PreDestroy
	public void clearB() {
		System.out.println("FORM DESTROY METHOD");
	}

}
