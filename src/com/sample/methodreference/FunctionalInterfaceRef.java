package com.sample.methodreference;

public class FunctionalInterfaceRef {

	public static void main(String[] args) {
		
		//referencing static method to functionalInterface
		FunctionalRef functionalRef = FunctionalInterfaceRef::printSomething;
		functionalRef.myMethod("Hello World");
	}

	public static void printSomething(String msg) {
		System.out.println(msg);
	}
}

@FunctionalInterface
interface FunctionalRef {
	void myMethod(String msg);
}
