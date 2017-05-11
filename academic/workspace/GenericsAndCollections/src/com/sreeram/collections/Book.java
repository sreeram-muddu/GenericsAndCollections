package com.sreeram.collections;

public class Book implements Comparable<Book>{
	
	private String authorName;
	private String title;
	private Integer pages;
	
	public Book(String authorName,String title,Integer pages)
	{
		this.authorName=authorName;
		this.title=title;
		this.pages=pages;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public int compareTo(Book otherBook) {
		
		if(this.pages < otherBook.getPages()) return -1;
		if(this.pages > otherBook.getPages()) return +1;
		return 0;
	}
	
	public String toString(){
		return this.authorName+" "+this.title+" "+this.pages;
	}
	
	
	

}
