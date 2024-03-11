package com.sample.methodreference;

import java.util.function.Consumer;

public class ConstructorRef {
	
	//Parameterised constructor
	public ConstructorRef(String msg) {
		System.out.println("Calling "+msg+" inside a Constructor");
	}
	
	public static void main(String[] args) {
		
		//To call a 
		Consumer<String> constructor = ConstructorRef::new;
		constructor.accept("Hello");
		
	}
}
