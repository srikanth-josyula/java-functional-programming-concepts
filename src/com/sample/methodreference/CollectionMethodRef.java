package com.sample.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionMethodRef {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Set<String> set = Set.of("abc", "xyz", "123");

		 set.stream()
			.map(String::toUpperCase)
			.forEach(list::add);

		System.out.println(list);
	}
}
