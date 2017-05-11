package com.sreeram.collections;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		
		
		if(b1.getPages() < b2.getPages()) return -1;
		if(b1.getPages() > b2.getPages()) return +1;
		return 0;
	}

}
