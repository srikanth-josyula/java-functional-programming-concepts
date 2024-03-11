package com.sample.methodreference;

import java.util.Optional;

public class OptionalClassMethodRef {

	public static void main(String[] args) {
		Optional<String> ops = Optional.of("Hello World");
		ops.ifPresent(System.out::println);
	}
}
