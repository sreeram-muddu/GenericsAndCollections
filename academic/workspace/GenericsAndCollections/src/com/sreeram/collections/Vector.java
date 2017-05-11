package com.sreeram.collections;

import java.util.List;

public class Vector {
	
	/*
	 * It is similar to ArrayList with some differences
	 * 
	 * Vectors are synchronized, multiple threads can manipulate the content without any inconsistency
	 * 
	 * new Vector(InitialCapacity,capacityIncrement)
	 * 
	 * The vector storage increases in chunks of the capacityIncrement
	 * 
	 * 
	 * 
	 */
	
	public static void main(String args[])
	{
	
		List<Integer> list = new java.util.Vector<>(5,5);
			
		list.add(2);
		list.add(4);
		list.add(6);
		
		for(Integer i : list)
			System.out.println(i);
	}

}
