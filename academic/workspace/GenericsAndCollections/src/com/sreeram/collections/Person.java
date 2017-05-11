package com.sreeram.collections;

public class Person implements Comparable<Person> {

	String name;
	Integer age;
	
	public Person(String name, Integer age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	

	@Override
	public int compareTo(Person other) {

		// lets build priority based on age , who is younger has highest priority
		
		return this.age.compareTo(other.getAge());
	
	}
	
	public String toString(){
		return this.name+" - "+this.age;
	}
	
	
	
}
