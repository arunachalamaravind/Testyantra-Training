package com.te.javabasics.exceptionhandling;

public class BankAccount {
	
	int bal;
	int total;
	BankAccount(int bal1){
		this.bal=bal1;
	}
	public void withDraw(int amount) {
		if(this.bal>amount) {
			total = this.bal-amount;
			System.out.println("Available balance : "+total);
		}
		else {
			throw new ExcepBank("Insufficient amount");
		}
	}
	
	
}
