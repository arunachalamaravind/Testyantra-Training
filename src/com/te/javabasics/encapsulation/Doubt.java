package com.te.javabasics.encapsulation;

public class Doubt {
	
	static int a = 10;
	private static int b = 20;
	
	private int encap() {
		
		return b;
				 
	}
	
	public int encap1() {
		return encap();
	}
}
