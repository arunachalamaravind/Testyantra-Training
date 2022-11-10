package com.te.javabasics.exceptionhandling;

public class CheckException extends Exception {

	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
//		try {
//			m1();
//		}
//		catch (Exception e) {
//			System.out.println("good bye");
//		}
		m1();
	}
	
	static void m1()throws Exception {
		m2();
	}
	
	static void m2()throws Exception {
		
		throw new ArithmeticException() ;
}
}