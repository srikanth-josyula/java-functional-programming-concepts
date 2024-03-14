package com.sample.stringsapi;

import java.util.Arrays;
import java.util.List;

public class StringFeatures {

	public static void main(String[] args) {

		/**
		 * Java 8
		 */
		String str1 = String.join("abc", "123", "xyz", "def", "ghi", "jkl");
		System.out.println(str1); // 123abcxyzabcdefabcghiabcjkl

		List<String> strArry = Arrays.asList("abc", "123", "xyz", "def");
		String str2 = String.join(",", strArry);
		System.out.println(str2); // abc,123,xyz,def

		String str3 = String.join("-", "Java", "is", "cool");
		System.out.println(str3); // Java-is-cool

		/**
		 * Java 9
		 */
		// chars() and codePoints() are the two new methods introduced in Java 9. Both
		// return an IntStream.
		"String".chars().forEach(System.out::print); // 83116114105110103
		"String".codePoints().forEach(System.out::print); // 83116114105110103

		/**
		 * Java 11
		 */
		// There are 6 new string methods are introduced in Java 11. They are –
		// isBlank(), lines(), repeat(), strip(), stripLeading() and stripTrailing().

		// A string is said to be blank if it is empty or contains only white spaces.
		System.out.println("".isBlank()); // Output : true
		System.out.println("   ".isBlank()); // Output : true
		System.out.println("\t \t".isBlank()); // Output : true
		System.out.println("\n \n".isBlank()); // Output : true
		System.out.println("STRING".isBlank()); // Output : false
		System.out.println("String \t \n".isBlank()); // Output : false

		// A line can be defined as a sequence of zero or more characters followed by a
		// line terminator.
		System.out.println("\n\n".lines().count()); // Output : 2
		System.out.println("abc \n xyz".lines().count()); // Output : 2
		System.out.println("123 \n 456 \n".lines().count()); // Output : 2
		System.out.println("abc \n 123 \n xyz".lines().count()); // Output : 3

		// This method returns the calling string repeated n times.
		System.out.println("1".repeat(5)); // 11111
		System.out.println("abc".repeat(3)); // abcabcabc
		System.out.println("1a2b3c".repeat(2)); // 1a2b3c1a2b3c

		// ou can use this method to remove all leading and trailing white spaces of the
		// given string.
		System.out.println("   1   ".strip()); // 1
		System.out.println("\t A \t".strip()); // A
		System.out.println("\n A1 \n".strip()); // A1
		System.out.println("1   A".strip()); // 1 A

		// This method removes only leading white spaces of a string
		System.out.println("    1".stripLeading()); // 1
		System.out.println("   11".stripLeading()); // 11
		System.out.println("  111".stripLeading()); // 111
		System.out.println(" 1111".stripLeading()); // 1111

		System.out.println("   1    ".stripTrailing()); // 1
		System.out.println("  11    ".stripTrailing()); // 11
		System.out.println(" 111    ".stripTrailing()); // 111
		System.out.println("1111    ".stripTrailing()); // 1111

	}

}
