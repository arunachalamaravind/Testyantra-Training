package com.te.restaurnt.Project;

import java.util.Scanner;

public class Demo {
	static Scanner scanner = new Scanner(System.in);
	static int user;
	static int input;
	static int total;

	public static void main(String[] args) {
		System.out.println("\t\t\tWelcome To Annachi Restaurnt\n");
		//Thread.sleep(300);
		try {
		myProject();
		}
		catch (ExcepRestraunt e) {
			System.out.println(e.getMessage());
		}
}
	public static void myProject() {
		String [] menu = {"Biriyani", "Chicken-65", "Mutton-65", "Fish-65","Exit"};
		int [] rate = {20,15,25,30,0};
		int [] quantity = new int[rate.length];
		int sum = 0;
		boolean exit = true;
		do {
			System.out.println("Menu and price\n");
			//Thread.sleep(300);
			for(int i=0;i<rate.length;i++) 
				System.out.println((i+1)+"."+" "+menu[i]+" = "+rate[i]);
				//Thread.sleep(100);
				System.out.print("Enter the Number of Item : ");
				input = scanner.nextInt();
			
			//Thread.sleep(500);
			
			switch (input) {
			case 1:
					System.out.println("Selected Item Name is : "+menu[input-1]);
					//Thread.sleep(300);
					System.out.println();
					System.out.print("enter the quantity : ");	
					user=scanner.nextInt();
					System.out.println();
					//Thread.sleep(300);
					billCalculate(user,rate[input-1]);
					
				break;
			case 2:
					System.out.println("Selected Item Name is : "+menu[input-1]);
					//Thread.sleep(300);
					System.out.println();
					System.out.print("enter the quantity : ");	
					user=scanner.nextInt();
					System.out.println();
					//Thread.sleep(300);
					billCalculate(user,rate[input-1]);
			
		break;
			case 3:
					System.out.println("Selected Item Name is : "+menu[input-1]);
					//Thread.sleep(300);
					System.out.println();
					System.out.print("enter the quantity : ");	
					user=scanner.nextInt();
					System.out.println();
					//Thread.sleep(300);
					billCalculate(user,rate[input-1]);
			
		break;
			case 4:
					System.out.println("Selected Item Name is : "+menu[input-1]);
					//Thread.sleep(300);
					System.out.println();
					System.out.print("enter the quantity : ");	
					user=scanner.nextInt();
					System.out.println();
					//Thread.sleep(300);
					billCalculate(user,rate[input-1]);
			
		break;
			case 5:
					totalProduct();
					System.out.println("Thanks for visiting");
					exit = false;
		break;
			
		
			default:		
					throw new ExcepRestraunt("Invalid Data");
				 
					// TODO: handle exception		
			}
			
		}while(exit);	
		
	}

	public static void billCalculate(int a, int b) {
		int count[] = new int[input];

		for (int i = 0; i < count.length; i++) {
			count[i] = a * b;
			total += count[i];

		}

	}

	public static void totalProduct() {
		System.out.println("Total bill amount : " + total);
	}
}
