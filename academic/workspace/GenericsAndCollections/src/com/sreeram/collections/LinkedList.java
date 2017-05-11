package com.sreeram.collections;

import java.util.Collections;
import java.util.List;

public class LinkedList {
	/*
	 * 
	 * It implements list interface 
	 * 
	 * Elements are stored as 1 <-> 2 <-> 3 <-> 4 (using references)
	 * 
	 * No random  access is possible in linkedlist
	 * No Synchronization
	 * we can remove item is efficient ( O(N) , unlike arraylist we need not shift elements
	 * 
	 * We should use linked list for remove for heavy remove applications
	 */
	
		public static void main(String args[])
		{
			
			List<Integer> list = new java.util.LinkedList<>();
			

			
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			
			
			System.out.println(list.get(2)); // it takes o(N) time
			
			for(Integer item:list)
			{
				System.out.println(item);
			}
			
			//Book class extending Comparable Interface and over riding CompareTo method
			List<Book> books = new java.util.ArrayList<Book>();
			books.add(new Book("name","title",240));
			books.add(new Book("muddu","lets see",250));
			books.add(new Book("abhishek","donno",20));
			books.add(new Book("munna","title",840));
			books.add(new Book("dad","title",365));
			
			//Collections.sort(books);

			
			Collections.sort(books, new BookComparator());
			System.out.println(books);
			
			
			
			
		}

}
