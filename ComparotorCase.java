package com.te.maven;

import java.util.Comparator;

public class ComparotorCase {

	public static Comparator comparator;

	public static void main(String[] args) {
		Comparator<DemoStudent1> comparator = (a,b) -> {
			return a.demostudentid - b.demostudentid;
		};
	//	comparator.compare(DemoStudent1 a, DemoStudent1 b);

	}

}
 
