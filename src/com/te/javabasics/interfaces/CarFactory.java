package com.te.javabasics.interfaces;

import java.util.Scanner;

public class CarFactory {
	
	public  Car getCar() {
		Scanner scannner = new Scanner(System.in);
		System.out.println("enter the car name");
		String car_name = scannner.nextLine();
		if (car_name.equalsIgnoreCase("audi")) {
			return new Audi();
			
		} else if(car_name.equalsIgnoreCase("bmw")){
			return new Bmw();
		} else {
			return null;
		}
		
				
	}
	
	
}
