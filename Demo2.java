package com.te.restaurnt.Project;

import java.util.Scanner;

public class Demo2 {
	static int user;
	static int input;
	static Scanner scanner = new Scanner(System.in);
	static void recycle() {
	switch (noofitem[j]) {
	case "biriyani":
		System.out.println("Selected Item Name is : " + menu[input - 1]);
		Thread.sleep(300);
		System.out.println();
		System.out.print("enter the quantity : ");
		user = scanner.nextInt();
		System.out.println();
		Thread.sleep(300);
		billCalculate(user, Demo.rate[input - 1]);

		break;
	case "Chicken-65":
		System.out.println("Selected Item Name is : " + menu[input - 1]);
		Thread.sleep(300);
		System.out.println();
		System.out.print("enter the quantity : ");
		user = scanner.nextInt();
		System.out.println();
		Thread.sleep(300);
		billCalculate(user, rate[input - 1]);

		break;
	case "Mutton-65":
		System.out.println("Selected Item Name is : " + menu[input - 1]);
		Thread.sleep(300);
		System.out.println();
		System.out.print("enter the quantity : ");
		user = scanner.nextInt();
		System.out.println();
		Thread.sleep(300);
		billCalculate(user, rate[input - 1]);

		break;
	case "Fish-65":
		System.out.println("Selected Item Name is : " + menu[input - 1]);
		Thread.sleep(300);
		System.out.println();
		System.out.print("enter the quantity : ");
		user = scanner.nextInt();
		System.out.println();
		Thread.sleep(300);
		billCalculate(user, rate[input - 1]);

		break;
	case "Exit":
		totalProduct();
		System.out.println("Thanks for visiting");
		exit = false;
		break;

	default:
		System.out.println("Invalid data");
		break;
	}

	}

}
