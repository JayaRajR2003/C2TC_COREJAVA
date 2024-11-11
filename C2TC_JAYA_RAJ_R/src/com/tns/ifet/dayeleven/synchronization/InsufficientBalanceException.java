//Program to demonstrate User Defined Exception class
package com.tns.ifet.dayeleven.synchronization;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Insufficient balance in your account");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
