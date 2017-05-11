package com.sreeram.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	
	/*
	 * 
	 * 
	 * An object that maps keys to values. A map cannot contain duplicate keys
	 * 
	 * HashMap doesn't guarantee the order of the elements during retrieval
	 * 
	 * TreeMap - it is sorted
	 * 
	 * hashtable - is synchronized  and hence it is slow compared to hashmap
	 * 
	 * hashmap - not synchronized
	 * 
	 * effective implementation of hashfunction could guarantee retrieval of o(1)
	 * 
	 * 
	 */
	
	public static void main(String args[])
	{
		
		
		Map<String,String> hm = new HashMap<>();
		
		
		hm.put("muddu", "sreeram.muddu@gmail.com");
		hm.put("sreeram", "sreeram.muddu@sjsu.edu");
		hm.put("smuddu", "sreeram.muddu@priceline.com");
		
		
		System.out.println(hm.get("smuddu"));
		
		for(Map.Entry<String,String> entry : hm.entrySet())
		{
			System.out.print(entry.getKey()+" - ");
			
			System.out.println(entry.getValue());
		}
	}

}
