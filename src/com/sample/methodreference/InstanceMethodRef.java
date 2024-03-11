package com.sample.methodreference;

import java.util.function.Consumer;

public class InstanceMethodRef {

	public static void main(String[] args) {

		// created a instance of class
		InstanceMethodRef instance = new InstanceMethodRef();

		// Using Method Reference to call a instance method with class ref
		Consumer<String> consumer = instance::printSomething;
		consumer.accept("Hello World !");
	}

	// instance method
	public void printSomething(String msg) {
		System.out.println(msg);
	}

}
