package com.sample.lambda;

public class InnerClassExample {
	
	public static void main(String[] args) {
		//Lambda way of calling the Interface implemtation
		NoParamInnerI noParam = () -> System.out.println("This is called by Lambda Inner Class Calling");
		noParam.noParamMethod();

		// Normal way of calling an interface inside a inner class
		NoParamInnerI noParam2 = new NoParamInnerI() {
			@Override
			public void noParamMethod() {
				System.out.println("This is called by Traditional Inner Class Calling");
			}
		};
		noParam2.noParamMethod();
	}
}

// Interface
interface NoParamInnerI {
	void noParamMethod();
}
