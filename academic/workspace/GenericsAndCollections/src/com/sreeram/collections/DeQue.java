package com.sreeram.collections;

import java.util.ArrayDeque;

public class DeQue {

	/*
	 * 
	 * It is a double ended queue
	 * 
	 * we can insert and remove items from both first and last
	 * 
	 * offerFirst(T t) and offerLast(T t)
	 * 
	 * removeFirst(T t) and removeLast(T t)
	 * 
	 * It is not thread safe
	 * 
	 * It can be used as both stack and queue since we can insert and remove items from both ends
	 * 
	 */
	
	
	public static void main(String args[])
	{
		
		java.util.Deque<Integer> dq = new ArrayDeque<>();
		
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerLast(40);
		dq.offerLast(60);
		
		dq.removeFirst();
		dq.removeLast();
		
		for(Integer item : dq)
		{
			System.out.println(" "+item);
		}
		
	}
	
	
}
