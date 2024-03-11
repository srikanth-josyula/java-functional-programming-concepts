package com.sample.lambda;

public class ParamMethodExample {
	public static void main(String[] args) {

		// Test by using normal Inner Class
		ParamInnerI param1 = new ParamInnerI() {
			@Override
			public String paramMethod(String x, String y) {
				return ("Hello " + x + " Welcome to " + y + " with normal way");
			}
		};
		System.out.println(param1.paramMethod("Joe", "Lambda Examples"));

		// Test by Lambda Return statement
		ParamInnerI param2 = (String x, String y) -> {
			return ("Hello " + x + " Welcome to " + y + " with return keyword");
		};
		System.out.println(param2.paramMethod("Joe", "Lambda Examples"));

		// Test by Lambda No Return statement Very Simplified
		ParamInnerI param3 = (x, y) -> ("Hello " + x + " Welcome to " + y + " with no return keyword");
		System.out.println(param3.paramMethod("Joe", "Lambda Examples"));

	}
}

interface ParamInnerI {
	String paramMethod(String x, String y);

}
