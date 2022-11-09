package com.te.restaurnt.Project;

public class ExcepRestraunt extends RuntimeException {
	String message;
	public ExcepRestraunt(String message){
		super(message);
	}
}
