package com.te.javabasics.exceptionhandling;

public class Driver {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount(1000); 
		try {
			bank.withDraw(3000);
		} catch (ExcepBank e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
