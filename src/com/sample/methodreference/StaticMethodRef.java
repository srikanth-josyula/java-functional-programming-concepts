package com.sample.methodreference;

import java.util.function.Consumer;

public class StaticMethodRef {

	public static void main(String[] args) {

		//Using Method Reference to call a static method
		Consumer<String> consumer = StaticMethodRef::printSomething;
		consumer.accept("Hello World !");
	}

	//Static method
	public static void printSomething(String msg) {
		System.out.println(msg);
	}
}
