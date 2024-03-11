package com.sample.lambda;

import java.util.function.Function;

public class MultiLineLogics {

	public static void main(String[] args) {
		String input = "Java Concepts";

		Function<String, String> lowerCase = (x) -> {
			return x.toLowerCase();
		};

		System.out.println(lowerCase.apply(input));

	}

}
