package com.sreeram.generics;

class Main
{
	public static <T> T generic(T t)
	{
		return t;
	}
	
	public static <T> void showArray(T[] t)
	{
		for(T item:t)
		{
			System.out.print(" "+item);
		}
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Main.generic("muddu"));
//		System.out.println(Main.generic(24));
		
		Integer[] integerarray = {2,1,3,4,5};
		
		Main.showArray(integerarray);
		
		String[] stringarray = {"muddu","sreeram","all","should","be","good."};
		
		Main.showArray(stringarray);

	}

}
