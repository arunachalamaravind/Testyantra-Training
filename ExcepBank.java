package com.te.javabasics.exceptionhandling;

public class ExcepBank extends RuntimeException {
	String message ;
//	public ExcepBank(String message) {
//		super(message);
//		// TODO Auto-generated constructor stub
//	}
	
	public ExcepBank(String message) {
		this.message = message;
		// TODO Auto-generated constructor stub
	}
		public String getMessage() {
			return message;
		}
}
