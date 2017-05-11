package com.sreeram.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	
	/*
	 *
	 * Set is a collection that contains no duplicate elements
	 * 
	 * 1. HashSet 
	 *    - doesn't guarantee the order of insertion
	 *    -  implements hashmap in the background
	 *    - not synchronized
	 * 2.LinkedHashMap
	 *    - it uses hashmap internally 
	 *    - It preserves the insertion order of elements
	 *    - It uses doubly linked list to store elements
	 *    - not synchronized
	 *     
	 *3. TreeSet : Red black tree implementation     
	 *      o(logN) running time for most of the operations
	 *     sorted data structure
	 *    it internally uses treemap
	 *
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> s = new HashSet<>();
		
		s.add("muddu");
		s.add("sreeram");
		
		s.add("munna");
		
		for(String item:s)
			System.out.println(item);
		
		
		Set<String> lhs = new LinkedHashSet<>();
		
		lhs.add("anna");
		lhs.add("dorai");
		lhs.add("hotel");
		
		for(String item:lhs)
		{
			System.out.println(item);
		}
		
		
		
		Set<Integer> ts = new TreeSet<>();
		
		ts.add(2);
		ts.add(-3);
		ts.add(6);
		
		for(Integer item: ts)
			System.out.println(item);

	}

}
