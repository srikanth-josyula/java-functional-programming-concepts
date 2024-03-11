package com.sample.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Terminal operations produce a result or side effect, marking the end of a
 * stream
 */
public class TerminalOps {

	public static void main(String[] args) {

		List<String> list = List.of("A", "A", "C", "B", "D", "D", "d");

		//Returns an iterator for the elements of this stream. 
		list.stream().iterator().forEachRemaining(System.out::print); //AACBDDd
		
		// Display All Elements
		list.stream().forEach(System.out::print); // AABCDDd

		//So it makes no sense to use forEachOrdered with parallel ?? 
		list.stream().forEachOrdered(System.out::print); //AACBDDd

		// Displays the total count of elements
		System.out.println(list.stream().count()); // 7
		
		//returns whether all elements of this stream match the provided predicate. returns boolean
		System.out.println(list.stream().allMatch(str -> !str.toLowerCase().equals(str))); //false
		
		//returns whether any elements of this stream match the provided predicate. returns boolean
		System.out.println(list.stream().anyMatch(str -> !str.toLowerCase().equals(str))); //true
		
		// This method returns any element from a Stream
		Optional<String> any = list.stream().findAny();
		System.out.println(any.get()); //A
		
		// This method returns first element from a Stream
		Optional<String> first = list.stream().findFirst();
		System.out.println(first.get()); //A
		
		//collects and object resulting from those actions will be collected 
		System.out.println(list.stream().filter(str -> !str.toLowerCase().equals(str)).collect(Collectors.toList())); //[A, A, C, B, D, D]
		
		StringBuilder result1 = list.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y), (a, b) -> a.append(",").append(b));
		System.out.println(result1.toString()); //A,A,C,B,D,D,d
		
		System.out.println(list.stream().max(Comparator.comparing(item -> item.length())).get());
		
		System.out.println(list.stream().min(Comparator.comparing(item -> item.length())).get());
		
		//The reduce() method can reduce the elements of a stream to a single value. 
		System.out.println(list.stream().reduce((acc, item) -> acc + " " + item).get()); //A A C B D D d
				
		// returns whether no elements of this stream match the provided predicate.
		System.out.println(list.stream().noneMatch(str -> "o".equals(str))); //true
	
		
		list.stream().spliterator().forEachRemaining(System.out::print); //AACBDDd

	}

}
