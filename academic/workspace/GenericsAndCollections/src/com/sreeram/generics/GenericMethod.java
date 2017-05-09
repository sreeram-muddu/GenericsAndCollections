package com.sreeram.generics;

class Main
{
	public static <T> T generic(T t)
	{
		return t;
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Main.generic("muddu"));
		System.out.println(Main.generic(24));

	}

}
