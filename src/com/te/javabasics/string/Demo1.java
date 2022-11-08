package com.te.javabasics.string;

public class Demo1 {
	static String s1= "hello";
	static String s2 = "hello";
	public static void main(String[] args) {
		String s3 = new String("hello");
		String s4 = new String("fellow");
		
		//System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s3==s4);
	}

}
