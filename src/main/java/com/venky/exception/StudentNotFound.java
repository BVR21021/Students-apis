package com.venky.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public StudentNotFound(String message) {
		super(message);
	}
	
	

}
