package com.sample.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionsClassExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("abc","123","xyz","def"));
		
		/**
		 * Java 8
		 */
		// add the specified element to specified Collections 
        boolean b = Collections.addAll(list, "ghi", "jkl", "mno"); 
        if(b) {
        	System.out.println(list); //[abc, 123, xyz, def, ghi, jkl, mno]
        }
		
        
        Collection<String> collection = new ConcurrentLinkedQueue<String>();  
        collection.addAll(list);
        collection.removeIf(n -> n.matches("\\d+"));
        System.out.println(collection); //[abc, xyz, def, ghi, jkl, mno]
        
		
		/**
		 * Java 11
		 */
        //Returns true if the two specified collections have no elements in common
        List<String> list2 = new ArrayList<String>(Arrays.asList("abc","ghi","xyz","mno"));
        System.out.println("Is Disjoint "+Collections.disjoint(list,list2));
	}

}
