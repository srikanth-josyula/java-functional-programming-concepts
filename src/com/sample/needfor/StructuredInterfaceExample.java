package com.sample.needfor;

public class StructuredInterfaceExample {
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

interface TestI {
	
	// Normal interface supports multiple abstract methods
	String print();
	void test();
	
	//Default interface methods allow adding new methods to interfaces without breaking existing implementations.
	default void defaultMethod() {}
}