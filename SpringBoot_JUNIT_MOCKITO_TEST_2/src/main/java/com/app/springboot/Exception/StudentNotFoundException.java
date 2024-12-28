package com.app.springboot.Exception;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException() {
		super();
	}
	
	public StudentNotFoundException(String message) {
		super(message);
	}
}
