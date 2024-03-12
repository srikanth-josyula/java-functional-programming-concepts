package com.sample.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("abc","123","xyz","def");
		
		
		/** 
		 * Java 8 Features
		 **/
		list.forEach(System.out::print);
		
		list.stream().forEach(System.out::print);
		list.parallelStream().forEach(System.out::print);
		list.spliterator().forEachRemaining(System.out::print);
		
		//java.util.Arrays.asList() produces a list from which it is impossible to remove elements,
		//so it throws on a removal attempt.
		List<String> ints = new ArrayList<String>(Arrays.asList("abc","123","xyz","def"));
		ints.removeIf(n -> n.matches("\\d+")); 
		System.out.println(ints); //["abc","xyz","def"]
		
		
		/** 
		 * Java 9 Features
		 **/
		System.out.println(List.of("123","456","789","000"));
		
		/** 
		 * Java 17 Features
		 **/
		List<String> copiedList = List.copyOf(list);
		System.out.println(copiedList);
	}

}
