package com.eliaskrr.employeecontrol.model.exception;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String message) {
		super(message);
	}
	
}
