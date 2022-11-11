package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudendMain {
	static boolean exit = true;
	static ArrayList <Student> arrayList;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Student student = new Student(6, "surya", 52, 78);
		Student student1 = new Student(8, "praveen", 68, 88);
		Student student2 = new Student(10, "pugal", 21, 68);
		Student student3 = new Student(11, "siva", 32, 58);
		Student student4 = new Student(15, "padapanathan", 42, 38);
		Student student5 = new Student(13, "anand", 22, 48);
		

		arrayList = new ArrayList <Student>();
		arrayList.add(student);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);
		try {
		excep();
		}catch(StudentException e) {
			System.out.println(e.getMessage());
			excep();
		}

		
	}
	
	
	public static void arrange() {
		
			System.out.println("The type of Fliter the Data");
			System.out.println("1. By Id\n2. By Name\n3. By Age\n4. By Mark");
			System.out.print("select the Filter : ");
			int input = scanner.nextInt();
			System.out.println();
			switch (input) {
			case 1:System.out.println("Filter by Id");
                   Collections.sort(arrayList,new Id());			
                   for (Student student6 : arrayList) {
					System.out.println(student6);
				}
				break;
				
			case 2:System.out.println("Filter by Nmae");
            Collections.sort(arrayList,new Namecheck());			
            for (Student student6 : arrayList) {
				System.out.println(student6);
			}
			break;
			
			case 3:System.out.println("Filter by Age");
            Collections.sort(arrayList,new Age());			
            for (Student student6 : arrayList) {
				System.out.println(student6);
			}
			break;
			
			case 4:System.out.println("Filter by Marks");
            Collections.sort(arrayList,new Marks());			
            for (Student student6 : arrayList) {
				System.out.println(student6);
			}
			break;

			default:
					//System.out.println("Enter Ivalid Number");
				throw new FilterException("Enter Invalid Nmuber");
				
			}
		
	}
	
	public static void excep() {
		System.out.println("Before Filter the Data");
		for ( Student student8: arrayList) {
			System.out.println(student8);
		}
		try {
		arrange();
		}catch(FilterException e) {
			System.out.println(e.getMessage());
		}
		do {
		System.out.println("Do you want to Continue click 'yes' or 'no'");
		String continues = scanner.next();
		if (continues.equalsIgnoreCase("yes")) {
			try {
			arrange();
			}catch (FilterException e) {
				System.out.println(e.getMessage());
				}
		}
		else if(continues.equalsIgnoreCase("no")){
			exit = false;
		}
		else {
			throw new StudentException("Enter value is mismatch" );
			//System.out.println("Enter invalid data");
//			try {
//			throw new FilterException("Enter invalid data");
//			}catch (FilterException e) {
//				e.getMessage();
//			}
			}
		
		}while(exit);
		
	}

}
