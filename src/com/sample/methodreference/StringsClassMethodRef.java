package com.sample.methodreference;

import java.util.List;

public class StringsClassMethodRef {
	
	public static void main(String[] args) {
		
		List<String> list = List.of("test", "abc");
		list.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
}
