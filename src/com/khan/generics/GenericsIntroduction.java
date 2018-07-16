package com.khan.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsIntroduction {
	public static void main(String[] args) {
		/*
		 * This is non-generic example before 1.5. Need to type-cast every time to get the values from list(collections).
		 * 
	 	List list = new ArrayList();
		list.add("Wasim");
		list.add(230989);
		
		String name = (String) list.get(0);
		int dob = (int) list.get(1);
		
		System.out.println("Name is : "+name);
		System.out.println("dob is : "+dob);
		*
		*/
		
		/*
		 * This is generics. No need type casting. Compile time checking.
		 */
		List<String> list = new ArrayList<String>();
		list.add("Wasim");
		list.add("23-Sep-1989");
		
		String name = list.get(0);
		//int dob = list.get(1);  Type mismatch: cannot convert from String to int
		String dob = list.get(1);
		
		System.out.println("Name is : "+name);
		System.out.println("dob is : "+dob);
	}
}