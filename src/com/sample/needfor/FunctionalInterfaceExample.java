package com.sample.needfor;

public class FunctionalInterfaceExample {
	public static void main(String args[]) {

		// create anonymous inner class object
		TestI test = new TestI() {
			@Override
			public String print() {
				return "printSomething";
			}
			@Override
			public void test() {
				// TODO Auto-generated method stub
			}
			//Default interface methods are optional overrides for implementing classes.
		};
		System.out.println(test.print());
		// END of Anonymous Class
	}

}

@FunctionalInterface
interface Test2I {
	
	// If we have more than one abstract methods, we see a complie error
	//Invalid '@FunctionalInterface' annotation; Test2I is not a functional interface
	
	String firstMethod();
	//void secondMethod();
	
	// We can add many default methods
	default void defaultMethod() {}
}