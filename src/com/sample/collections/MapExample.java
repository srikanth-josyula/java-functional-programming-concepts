package com.sample.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		List<String> list = Arrays.asList("abc", "123", "xyz", "def");
		for (int i = 0; i < list.size(); i++) {
			map.put(i, list.get(i));
		}

		/**
		 * Java 8 Features
		 **/
		map.forEach((k,v) -> System.out.print("Key : "+k+", Value : "+v));
		
		//allows you to update a value in HashMap. 
		map.compute(0, (k, v) -> v.concat("d"));
		map.compute(1, (k, v) -> v.concat("4"));
		System.out.println(map);  //{0=abcd, 1=1234, 2=xyz, 3=def}
		
		
		//Store the computed value for the key in Hashmap 
		//if the key is not already associated with a value (or is mapped to null) else null.
		map.computeIfAbsent(4, k -> "ghi");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghi}
		
		map.computeIfPresent(4, (k, v) -> (v != null) ? v.concat("j") : "");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij}
	
		
		//used to combine multiple mapped values for a key using the given mapping function
		map.merge(5, "klm", (k, v) -> k + v);
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij, 5=klm}
		
		
		map.replace(5, "opq");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij, 5=opq}
		map.replace(5, "opq", "rst");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij, 5=rst}
	
		
		//Removes the entry for the specified key only if it is currently mapped to the specified value.
		map.remove(5, "rst");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij}
		map.remove(4,"");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij} 4 is not removed
		
		
		//used to get the value mapped with specified key. If no value is mapped with the provided key 
		//then the default value is returned. 
		System.out.println(map.getOrDefault(3, "NOT DEFINED")); //def
		System.out.println(map.getOrDefault(8, "NOT DEFINED")); //NOT DEFINED
		
		
		//used to map the specified key with the specified value
		map.putIfAbsent(3, "Default Value");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij}
		
		map.putIfAbsent(8, "Default Value");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij, 8=Default Value}

		map.putIfAbsent(9, "Default Value");
		System.out.println(map); //{0=abcd, 1=1234, 2=xyz, 3=def, 4=ghij, 8=Default Value, 9=Default Value}
		
		/**
		 * Java 9 Features
		 **/
		Map<String, String> map3 = Map.of("A", "Alex", "B", "Brian", "C", "Charles");
		System.out.println(map3); //{B=Brian, A=Alex, C=Charles}
		
		Map<Long, String> longUserMap = Map.ofEntries(Map.entry(1L, "User A"), Map.entry(2L, "User B"));
		System.out.println(longUserMap); //{2=User B, 1=User A}

	
		/**
		 * Java 17 Features
		 **/
		Map<Integer, String> copiedMap = Map.copyOf(map);
		System.out.println(copiedMap);
	}

}
