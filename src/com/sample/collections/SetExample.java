package com.sample.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>(Arrays.asList("abc","123","xyz","def"));
	
		
		/** 
		 * Java 8 Features
		 **/
		set.forEach(System.out::print);
		
		set.stream().forEach(System.out::print);
		set.parallelStream().forEach(System.out::print);
		set.spliterator().forEachRemaining(System.out::print);
		
		System.out.println(set.removeIf(n -> n.matches("\\d+")));
	
		
		/** 
		 * Java 9 Features
		 **/
		System.out.println(Set.of("123","456","789","000"));
		
		/** 
		 * Java 17 Features
		 **/
		Set<String> copiedSet = Set.copyOf(set);
		System.out.println(copiedSet);
		
	}

}
