package com.sreeram.collections;

import java.util.PriorityQueue;

public class MyPriorityQueue {
	
	/*
	 * 
	 * 
	 * Based on priority heap
	 * 
	 * we assign a prirority value to every single items
	 * 
	 * - element with high priority is served before element with low priority
	 * 
	 * - elements added to the queue should implement comparable interface and over ride compareTo method
	 * 
	 * - that is how the priorityQueue is going to know about priority while fetching the elements
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Queue<Person> q = new PriorityQueue<Person>();
		
		q.add(new Person("muddu",25));
		q.add(new Person("Sreeram", 22));
		
		for(Person p:q)
			System.out.println(p);
		
		java.util.Queue<Integer> sq = new PriorityQueue<>();
		
		sq.add(5);
		sq.add(2);
		
		for(Integer i:sq)
			System.out.println(i);
		


	}

}
