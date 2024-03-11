package com.sample.lambda;

public class BasicUsageExample {
	
	public static void main(String[] args) {
		
		// Calling the Impl Class
		NoParamImplementation noParam = new NoParamImplementation();
		noParam.noParamMethod();
		
		
		NoParamI noParamLamda = () -> System.out.println("This is a Lambda Way of Calling");
		noParamLamda.noParamMethod();
	}
}

// Implementation of Interface
class NoParamImplementation implements NoParamI {
	@Override
	public void noParamMethod() {
		System.out.println("This is a Traditional Way of Calling");
	}
}

// Interface with an Abstract Method
interface NoParamI {
	void noParamMethod();
}
