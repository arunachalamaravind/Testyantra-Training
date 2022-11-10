package com.te.restaurnt.Project;

import java.util.Scanner;

public class Demo3 {
	static Scanner scanner = new Scanner(System.in);
	static int qty;
	static int total;
	public static void main(String[] args) {
		System.out.println("Welcome To Annachi Restraunt");
		menu();
		System.out.println("Current Total Bill "+total+"\n");
		System.out.println("Do You want to continue click YES OR NO");
		String continues = scanner.next();
		if(continues.equalsIgnoreCase("yes")) {
			try {
			menu();
			}catch(RestaruantException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Total Bill : "+total);
		}
		else
			throw new RestaruantException("Thank you for visiting");
			
	}
	
	public static void menu() {
		String [] menu = {"Biriyani  ", "Chicken-65", "Mutton-65 ", "Fish-65   "};
		int [] rate = {20,15,25,30};
		System.out.println("Annachi Restraunt Menu Card");
		for (int i = 0; i < rate.length; i++) {
		System.out.println((i+1)+". "+menu[i]+" = "+rate[i]);
		}
		System.out.println("Enter the Number of Item");
		int item = scanner.nextInt();
		int input[] = new int[item];
		System.out.println("choose the Item");
		for(int i = 1;i<=item;i++) {
			if((i>1)||(i<item)) {
			System.out.println("Enter the next item");}
			input [i-1] = scanner.nextInt();
			System.out.print("selected item is : ");
			System.out.print(menu[i-1]);
			System.out.println();
			System.out.print("Enter the quantity : ");
			qty = scanner.nextInt();
			System.out.println();
			total += qty*rate[i-1]; 
			
		}
}
}