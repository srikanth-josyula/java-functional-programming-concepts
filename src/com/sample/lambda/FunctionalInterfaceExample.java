package com.sample.lambda;

public class FunctionalInterfaceExample {
	
	public static void main(String[] args) {
		
		//Lambda way of calling the Sample FunctionalInterface 
		//we are calling the noparam one directly
		SampleFunctionalInterface fi = () -> System.out.println("Lambda way of calling the Functional Interface abstract method");
		
		//Calling methods
		fi.someMethod1();
		System.out.println(fi.someMethod2());
		System.out.println(fi.someMethod3("test Data"));
	}
}

@FunctionalInterface
interface SampleFunctionalInterface{
	
	void someMethod1();
	
	default String someMethod2() {
		return "Execute the method someMethod2";
	}
	
	default String someMethod3(String data) {
		return "Execute the method someMethod3 along with "+data;
	}
	
	// As we have @FunctionalInterface we can't have multiple abstract methods
	//void someMethod3();
	
}

