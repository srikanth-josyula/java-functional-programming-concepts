package com.sample.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class CompatibleFutureExample {
	
	public static void main(String[] args) {
		 CompletableFuture<String> completableFuture = new CompletableFuture<>();

		    Executors.newFixedThreadPool(1).submit(() -> {
		        Thread.sleep(500);
		        completableFuture.complete("Hello");
		        return null;
		    });

	}

}
