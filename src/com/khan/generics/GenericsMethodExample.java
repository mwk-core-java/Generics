package com.khan.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodExample {

	public static <E> void printValue(E val){
		System.out.println("printValue : "+val);
	}

	public static <E> void printArray(E[] arr){
		for(E eachVal : arr)
			System.out.println("printArray : "+eachVal);
	}
	
	public static <E> void printList(List<E> list){
		for(E eachVal : list)
			System.out.println("printList : "+eachVal);
	}


	public static void main(String[] args) {
		GenericsMethodExample.printValue("Avdesh Pratap Singh Gautam");
		GenericsMethodExample.printValue(11071990);
		
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(10101990);
		listInt.add(8021990);
		listInt.add(7041989);
		GenericsMethodExample.printList(listInt);
		
		
		List<String> listString = new ArrayList<String>();
		listString.add("Hemant");
		listString.add("Avdesh");
		listString.add("Yadav");
		GenericsMethodExample.printList(listString);
		
		
		Integer[] intArray = {2,6,1,9,44,23,12};
		String[] strArray = {"Wasim","Yadav","Pate","Amit"};
		GenericsMethodExample.printArray(intArray);
		GenericsMethodExample.printArray(strArray);
		
	}
}
