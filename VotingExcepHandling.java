package com.te.javabasics.exceptionhandling;

import java.util.Scanner;
public class VotingExcepHandling {
	static int input;
	
	static Scanner scanner = new Scanner(System.in);
	static void handlinExcp(int age) {
		
		if(age<18) {
			throw new VotingException("not eligilbe");
			//throw new VotingException();
		}
		else {
			System.out.println("elgible for voting");
		}
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
			input = scanner.nextInt();
		try {
			handlinExcp(input);
		}
		catch (VotingException e){
			System.out.println(e.getMessage());
		}
		
	}

}
