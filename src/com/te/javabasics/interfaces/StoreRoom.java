package com.te.javabasics.interfaces;
import java.util.Scanner;

public class StoreRoom  {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String car_name = s.nextLine();
//		System.out.println("click 1 for Audi , click 2 for Bmw");
//		int car_name= s.nextInt();
//		switch (car_name) {
//		case 1:
//			Car car = new Audi();
//			car.accelerate();
//			car.brakes();
//			car.gear();
//			
//			break;
//
//		case 21 :
//			Car car1 = new Bmw();
//			car1.accelerate();
//			car1.brakes();
//			car1.gear();
//			break;
//		}
	
	CarFactory carFactory = new  CarFactory();
	Car car = carFactory.getCar();
	CarTest car5 = new CarTest();
	car5.carTest(car);
		
	
		
	}

}
