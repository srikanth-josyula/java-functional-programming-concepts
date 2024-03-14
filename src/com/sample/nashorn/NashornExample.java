package com.sample.nashorn;

import java.io.FileReader;

import javax.script.*;

public class NashornExample {

	public static void main(String[] args) throws Exception {
		// Creating script engine
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		
		// Evaluating Nashorn code
		ee.eval("print('Hello World');");
		
		// Reading Nashorn file  
        ee.eval(new FileReader("src\\com\\sample\\nashorn\\scripts\\hello.js"));  
        
        //Warning: Nashorn engine is planned to be removed from a future JDK release
	}
}
