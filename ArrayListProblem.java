package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		arrayList.add("arun");
		arrayList.add("aravind");
		arrayList.add("surya");
		arrayList.add("kumar");
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for (Object object : arrayList) {
			
		}
	}

}
