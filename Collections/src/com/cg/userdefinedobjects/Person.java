package com.cg.userdefinedobjects;

import java.util.Comparator;

public class Person {
	private String name;
	private String city;
	
	public Person() {
		super();
	}
	

public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}




public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Person [name=" + name + ", city=" + city + "]";
}

}

class SortByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
	
		return o1.getName().compareTo(o2.getName());
	}
	
}


class SortByCity implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
	
		return o1.getCity().compareTo(o2.getCity());
	}
	
}






