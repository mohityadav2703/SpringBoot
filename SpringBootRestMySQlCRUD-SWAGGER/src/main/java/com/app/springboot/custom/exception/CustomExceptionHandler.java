package com.app.springboot.custom.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.springboot.Exception.StudentNotFoundException;
import com.app.springboot.bean.ErrorMessage;

@RestControllerAdvice // it is use to display all the error message of application from here
public class CustomExceptionHandler {

  /*
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> showStudentNotFound(StudentNotFoundException snfe){
		return new ResponseEntity<String> (snfe.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}	*/
	
	// To return class type exception
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorMessage> showStudentNotFound(StudentNotFoundException snfe){
		return new ResponseEntity<ErrorMessage>(new ErrorMessage(snfe.getMessage(),"STUDENT","NOT FOUND",new Date().toString()),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
