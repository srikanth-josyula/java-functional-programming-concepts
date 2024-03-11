package com.sample.lambda;

public class AccessingVaribles {

	static String globalVar = "GlobalVar";

	public static void main(String[] args) {
		String localVar = "LocalVar";

		// Lambda way of calling the Interface implemtation
		VariableInnerI varI = (someData) -> System.out
				.println("This is called by Lambda Calling Variables | " + someData + " " + globalVar + ", " + localVar);
		varI.someMethod("We are Appending Local Variable Value =");

		// Normal way of calling an interface inside a inner class
		VariableInnerI varI2 = new VariableInnerI() {
			String innerVar = "InnerVar";
			@Override
			public void someMethod(String someData) {
				System.out.println("This is called by Traditional Calling Variables | " + someData + ", " + globalVar
						+ " " + localVar+", "+innerVar);
			}
		};
		varI2.someMethod("We are Appending Local Variable Value =");
	}
}

// Interface
interface VariableInnerI {
	void someMethod(String var);
}
