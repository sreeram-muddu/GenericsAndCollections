package com.sreeram.collections;

public class Stack {
	
	/*
	 * Last in First out (LIFO) principle
	 * 
	 * push() method to push an item to the stack
	 * peek() would retrieve the top element in the stack but doesn't remove the element
	 * pop() would remove and return the top of the stack
	 * 
	 * 
	 */

	
	public static void main(String args[])
	{
         java.util.Stack<Integer> s = new java.util.Stack<>();
         
         s.push(1);
         s.push(4);
         s.push(9);
         s.push(8);
         s.push(10);

         
         System.out.println("The peek element is "+s.peek());
         
         
         System.out.println(" Removing top item "+s.pop());
         
         
         for(Integer item : s)
        	 System.out.println(item);
         
	}


}


