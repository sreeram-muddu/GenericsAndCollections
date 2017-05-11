package com.sreeram.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	
	/*
	 * TreeMap sorts the entries in the order of key
	 * or we can use comparable interface to over write sorting for the objects
	 * 
	 * it implements red-black tree internally to store elements
	 * 
	 * O(LogN) guaranteed running time for get put remove
	 * 
	 * It is not synchronized
	 */
	
	public static void main(String args[])
	{
		
	Map<Person,Integer> treeMap = new TreeMap<Person,Integer>();
	
	treeMap.put(new Person("sreeram",40),24);
	treeMap.put(new Person("muddu",60), 20);
	
	for(Map.Entry<Person, Integer> entry: treeMap.entrySet())
	{
		System.out.print(" "+entry.getKey()+" - ");
		System.out.println(entry.getValue());
	}
	
	}

}
