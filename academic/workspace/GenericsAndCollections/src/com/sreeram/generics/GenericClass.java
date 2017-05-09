package com.sreeram.generics;

class Store<T>
{
	T item;
	
	public void setItem(T item)
	{
		this.item=item;
	}
	
	public T getItem()
	{
		return item;
	}
}


public class GenericClass {
	
	public static void main(String args[])
	{
		Store<Integer> is = new Store<>();
		
		is.setItem(24);
		
		System.out.println("THe value of the integer is "+is.getItem());
		
		Store<String> ss = new Store<>();
		
		ss.setItem("muddu");
		
		System.out.println("The value of the String is "+ss.getItem());
		
		
		
		
	}

}
