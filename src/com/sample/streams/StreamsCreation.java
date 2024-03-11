package com.sample.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreation {

	public static void main(String[] args) {

		// creation from array
		String[] arry = new String[] { "Google", "Apple", "Microsoft" };
		Stream<String> strStream = Arrays.stream(arry);
		strStream.forEach(p -> System.out.print(p + ", "));

		// Returns a sequential Stream with the specified range of the specified array
		// as its source. includes 1 and excludes 2
		Stream<String> streamOfArrayPart = Arrays.stream(arry, 1, 2);
		streamOfArrayPart.forEach(p -> System.out.print(p + ", "));

		List<String> list = Arrays.asList(arry);
		Stream<String> listStream = list.stream();
		listStream.forEach(p -> System.out.print(p + ", "));

		// From a List of elements
		Stream<String> streamOf = Stream.of("Google", "Apple", "Microsoft");
		streamOf.forEach(p -> System.out.print(p + ", "));

		// using generate function, generate random stream
		Stream<Double> stream = Stream.generate(Math::random);
		stream.forEach(p -> System.out.print(p + ", "));
		
		
		//using builder
		Stream<String> streamBuilder = Stream.<String>builder()
				.add("a")
				.add("b")
				.add("c").build();
		streamBuilder.forEach(p -> System.out.print(p+", "));

	}

}
