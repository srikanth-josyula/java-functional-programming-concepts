package com.sample.lambda;

public class RunnableExample {
	
	public static void main(String[] args) {
		
		//Lambda way of calling the Runnable Thread Implementation
		Runnable run2 = () -> System.out.println("Lambda way of calling the Runnable Thread Implementation");
		Thread th2 = new Thread(run2);
		th2.start();

		//Normal way of calling the Runnable Thread Implementation
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("Normal way of calling the Runnable Thread Implementation");
			}
		};
		Thread th = new Thread(run);
		th.start();
	}
}

