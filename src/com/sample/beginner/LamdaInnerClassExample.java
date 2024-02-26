package com.sample.beginner;

public class LamdaInnerClassExample {
	public static void main(String[] args) {
		
		NoParamInnerI noParam = () -> System.out.println("This is called by Lambda Inner Class Calling");
		noParam.noParamMethod();

		
		NoParamInnerI noParam2 = new NoParamInnerI() {
			@Override
			public void noParamMethod() {
				System.out.println("This is called by Traditional Inner Class Calling");
			}
		};
		noParam2.noParamMethod();
	}
}


interface NoParamInnerI {
	void noParamMethod();
}
