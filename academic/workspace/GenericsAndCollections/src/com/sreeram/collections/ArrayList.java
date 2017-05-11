package com.sreeram.collections;

import java.util.List;

public class ArrayList {

	/*
	 *  Implementation of List interface
	 *  Random access is very fast because we can use index to retrieve element
	 * 	It is equivalent to vector but vector is thread safe but arraylist is not
	 * Removing item from the array list is costly operation as we need to shift the position of remaining elemnts in the arary list.
	 * 
	 * If we know the minimum size or initial size of the array we can define that as argument to constructor
	 * 
	 * List<Integer> list = new ArrayList<>(100);// 100 will be initial capacity of array
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new java.util.ArrayList<>(2);
		
		list.add(1);
		list.add(2);
		
		for(Integer i:list)
			System.out.println(i);
		

	}

}
