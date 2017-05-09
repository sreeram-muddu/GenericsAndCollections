package com.sreeram.generics;

class MyHashTable<K,V>
{
	K key;
	V value;
	
	MyHashTable(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public String toString()
	{
		
		return this.key+" - "+this.value;
	}
}

public class MultipleParametersGenericClass {

	public static void main(String[] args) {

		
		MyHashTable<String, Integer> ht = new MyHashTable<>("muddu",24);
		
		System.out.println(ht);
		
	}

}
