package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElement {
	static ArrayList<Student1> arrayList;
	static HashSet< Student1> hashSet ;
static Scanner scanner = new Scanner(System.in);
static boolean condition = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList = new ArrayList<Student1>();
		do {
		System.out.print("Enter the Id number : ");
		int studentId = scanner.nextInt();
		System.out.println();
		System.out.print("Enter the Student Name : ");
		String studentName = scanner.next();
		System.out.println();
		System.out.print("Enter the Age : ");
		int studentAge = scanner.nextInt();
		System.out.println();
		System.out.print("Enter the Mark : ");
		int studentMark = scanner.nextInt();
		System.out.println();
		
		arrayList.add(new Student1( studentId, studentName, studentAge, studentMark));
		Collections.sort(arrayList,new Studentcompare());
		hashSet = new HashSet(arrayList);
		System.out.println("Do you want to continue click yes or NO");
		String input = scanner.next();
		if(input.equalsIgnoreCase("no")) {
			condition = false;
		}
		
		}while(condition);		
		for ( Object arun : hashSet) {
		System.out.println(arun);	
		}
		
	}
	
	
	}


