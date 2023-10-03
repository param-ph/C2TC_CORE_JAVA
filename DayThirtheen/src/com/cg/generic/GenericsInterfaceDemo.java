package com.cg.generic;

public class GenericsInterfaceDemo {

	public static void main(String[] args) {
		Float arr[] = {3.22f, 855.9f,45.26f,15.88f};
		MinMaxImp<Float> objOne = new MinMaxImp<Float>(arr);
		System.out.println("Minimum value is: " + objOne.min());
		System.out.println("Maximum value is: " + objOne.max());
		
		String arrOne[] = {"Param", "Santosh", "Akshay","Abhishek"};
		MinMaxImp<String> objTwo = new MinMaxImp<String>(arrOne);
		System.out.println("Minimum value is: " + objTwo.min());
		System.out.println("Maximum value is: " + objTwo.max());
		
		Person[] p = {new Person ("Param","Gani"),new Person ("Ashitos","Banglore"), new Person ("Aksah","Bidar"), new Person("Raju","Belgam")};
		MinMaxImp<Person> objThree = new MinMaxImp<Person>(p);
		System.out.println("Minimum value is: " + objThree.min());
		System.out.println("Maximum value is: " + objThree.max());
	}

}
