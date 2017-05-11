package com.sreeram.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	
	/*
	 * 
	 *It has same features as hashmap 
	 * 
	 * but the insertion order is preserved
	 * 
	 * it is not synchronized
	 * 
	 * Iternally a doubly linked list is made between all entries to make sure the insertion order is preserved
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String args[])
	{
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(4,"Munna");
		linkedHashMap.put(1,"Dad");
		linkedHashMap.put(44,"smuddu");
		
		
		for(Map.Entry<Integer, String> entry: linkedHashMap.entrySet())
		{
			System.out.print(entry.getKey()+" - ");
			System.out.println(entry.getValue());
		}
		
		
		
	}

}
