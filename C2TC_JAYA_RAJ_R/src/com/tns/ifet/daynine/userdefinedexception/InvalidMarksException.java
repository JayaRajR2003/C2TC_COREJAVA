//Program to define User defined exception class
package com.tns.ifet.daynine.userdefinedexception;

public class InvalidMarksException extends Exception{

	private static final long serialVersionUID = 1L;

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}

	
}