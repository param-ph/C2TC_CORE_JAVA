package com.cg.generic;

public class Person implements  Comparable<Person>{
	 String name;
	 String city;
	 public Person() {
			super();
		}
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		return this.city.compareTo(o.city);
	}
	
}
