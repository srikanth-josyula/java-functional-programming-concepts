package com.sample.lambda;

import java.util.function.Consumer;

public class ExceptionHandlinginLambda {

	public static void main(String[] args) {

		int x = 0;

		Consumer<Integer> div = (y) -> {
			try {
				System.out.println(y / x);
			} catch (ArithmeticException e) {
				System.out.println("Exception Caught : " + e.getMessage());
			}
		};

		div.accept(2);
	}
}
