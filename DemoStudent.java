package com.te.maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;



public class DemoStudent {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<DemoStudent1> arrayList;
	static HashSet<DemoStudent1> hashSet ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStudent1 demoStudent = new DemoStudent1(10, "arun");
		DemoStudent1 demoStudent2 = new DemoStudent1(20, "aravind");
		DemoStudent1 demoStudent3 = new DemoStudent1(15, "praveen");
		DemoStudent1 demoStudent4 = new DemoStudent1(8, "siva");

		ArrayList<DemoStudent1> arrayList = new ArrayList<DemoStudent1>();
		arrayList.add(demoStudent);
		arrayList.add(demoStudent2);
		arrayList.add(demoStudent3);
		arrayList.add(demoStudent4);

		HashSet<DemoStudent1> hashSet = new HashSet<DemoStudent1>(arrayList);
		Comparator<DemoStudent1> comparator = (a,b) -> {
			return a.demostudentid - b.demostudentid;
		};
	

	

		System.out.println("The type of Fliter the Data");
		System.out.println("1. By Id\n2. By Name");
		System.out.print("select the Filter : ");
		String input = scanner.next();
		System.out.println();
		switch (input) {
		case "1":
			System.out.println("Filter by Id");
			Collections.sort(arrayList,comparator);
//			for (DemoStudent1 demoStudent5 : hashSet) {
//				System.out.println(demoStudent5);
//			}
			System.out.println(arrayList);
			break;

		case "2":
			System.out.println("Filter by Nmae");
			Collections.sort(arrayList, comparator);
			for (DemoStudent1 demoStudent6: hashSet) {
				System.out.println(demoStudent6);
			}
			break;
		}
	
}
}
