package com.sample.methodreference;

public class RunnableExample {
	
	public static void doSomething() {
		System.out.println("This method does something");
	}

	public static void main(String[] args) {
		// This will throw The target type of this expression must be a functional interface
		//String resp = MethodReferenceExample::doSomething;
		
		Runnable runnable = RunnableExample::doSomething;
		Thread th = new Thread(runnable);
		th.start();
			
	}
}
