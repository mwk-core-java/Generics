package com.khan.generics;

class GenericsClass<T> {
	T obj;  
	void add(T obj){
		this.obj=obj;
	}  
	T get(){
		return obj;
	}  
}
public class GenericsClassExample {
	public static void main(String[] args) {
		GenericsClass<String> genClassString = new GenericsClass<String>();
		genClassString.add("Hemant");

		System.out.println("String is : "+genClassString.get());


		GenericsClass<Integer> genClassInt = new GenericsClass<Integer>();
		genClassInt.add(24101988);

		System.out.println("Int is : "+genClassInt.get());
	}
}