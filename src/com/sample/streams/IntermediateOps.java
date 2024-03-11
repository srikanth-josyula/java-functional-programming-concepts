package com.sample.streams;

import java.util.Comparator;
import java.util.List;

/**
 * Intermediate operations transform or filter elements in a stream, returning a
 * new stream
 **/

public class IntermediateOps {

	public static void main(String[] args) {

		List<String> list = List.of("A", "A", "C", "B", "D", "D", "d");

		// Display Distinct Elements
		 list.stream().distinct().forEach(System.out::print); // ACBDd

		// Displays elements of stream, truncated no longer than maxSize in length
		 list.stream().limit(5).forEach(System.out::print); // AACBD

		// Displays elements of stream after discarding the first n elements
		 list.stream().skip(3).forEach(System.out::print); // BDDd

		//Drops elements until the predicate returns true here all elements before d are dropped
		list.stream().dropWhile(str -> !str.toLowerCase().equals(str)).forEach(System.out::print); //d
		
		//Returns stream consisting of the elements that match the given predicate. 
		list.stream().filter(str -> !str.toLowerCase().equals(str)).forEach(System.out::print); //AACBDD
		
		//Returns stream consisting applying the given function to the elements
		list.stream().map(str -> str+",").forEach(System.out::print); //,A,C,B,D,D,d,
		
		//Flattening is referred to as merging multiple collections/arrays into one.
		//Before flattening 	: [[1, 2, 3], [4, 5], [6, 7, 8]]
		//After flattening 	: [1, 2, 3, 4, 5, 6, 7, 8]
		List<List<Integer>> listOfLists = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8));
		listOfLists.stream()
			.flatMap(listq -> listq.stream())  // Flattening step
			.forEach(System.out::print);  //12345678
		
		//May return itself, either because the stream was already parallel, or because the underlying stream state was modified to be parallel. 
		list.stream().parallel().forEach(System.out::print); //DBAdDC
		
		//Support debugging when we want to see the elements as they flow through the Stream processing pipeline.
		//Stream.peek() without any terminal operation does nothing.
		list.stream().peek(str -> System.out.println("Processing: " + str)); //This prints nothing
		list.stream().peek(str -> System.out.println("Processing: " + str)).forEach(System.out::println); //AProcessing: A and so on
		
		//Returns an equivalent stream that is sequential
		list.stream().sequential().forEach(System.out::print); //AABCDDd
		
		//Returns sorted according to natural order
		list.stream().sorted().forEach(System.out::print); //ABCDDd
		
		//Returns sorted according to Comparator order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print); //dDDCBAA
		
		list.stream().takeWhile(str -> !str.toLowerCase().equals(str)).forEach(System.out::print); //AACBDD
		
		//Returns an equivalent stream that is unordered. May return itself, either because the stream was already unordered, 
		list.stream().unordered().forEach(System.out::print); //ACBDDd
	}
}
