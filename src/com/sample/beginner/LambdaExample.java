package com.sample.beginner;

public class LambdaExample {
	
	public static void main(String[] args) {
		NoParamImplementation noParam = new NoParamImplementation();
		noParam.noParamMethod();
		
		NoParamI noParamLamda = () -> System.out.println("This is a Lambda Way of Calling");
		noParamLamda.noParamMethod();
	}
}

interface NoParamI {
	void noParamMethod();
}

class NoParamImplementation implements NoParamI {
	@Override
	public void noParamMethod() {
		System.out.println("This is a Traditional Way of Calling");
	}
}
