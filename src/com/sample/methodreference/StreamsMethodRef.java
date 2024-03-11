package com.sample.methodreference;

import java.util.List;

public class StreamsMethodRef {

	public static void main(String[] args) {
		List<String> list = List.of("test", "abc");
		StreamsMethodRef ref = new StreamsMethodRef();
		list
			.stream()
			.map(ref::toupperCaseConvert)
			.forEach(System.out::println);
	}

	public String toupperCaseConvert(String msg) {
		return msg.toUpperCase();
	}
}
