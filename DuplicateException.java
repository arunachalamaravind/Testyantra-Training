package com.te.javabasics.collection;

public class DuplicateException extends RuntimeException {
	String message;
	public DuplicateException(String message) {
		super(message);
	}
 
}
