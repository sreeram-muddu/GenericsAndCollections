package com.sreeram.collections;

public class Queue {
	
	/*
	 * 
	 * Queue is a interface and is implemented by LinkedList
	 * 
	 * FIFO
	 * 
	 * q.element(); //would retrieve the first element that is inserted
	 */

	
	public static void main(String args[])
	{
		java.util.Queue<Integer> q = new java.util.LinkedList<>();
		
		q.add(2);
		q.add(4);
		q.add(5);
		
		
		for(Integer item:q)
			System.out.println(item);
		
		
		System.out.println("The first element is "+q.element());
		
	}
}
