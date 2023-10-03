package com.cg.setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {
	static void addElements(Set<Integer> numberHashgSet) {
		numberHashgSet.add(10);
		numberHashgSet.add(20);
		numberHashgSet.add(30);
		numberHashgSet.add(40);
		numberHashgSet.add(50);
		numberHashgSet.add(60);
	}

	public static void main(String[] args) {
		Set<Integer> numberHashgSet = new HashSet<>();
		
		Set<Integer> numberHashgSetOne = new HashSet<>();

		numberHashgSetOne.add(50);
		numberHashgSetOne.add(60);
		numberHashgSetOne.add(70);
		numberHashgSetOne.add(80);
		numberHashgSetOne.add(90);
		numberHashgSetOne.add(100);
		// Union
		Set<Integer> numberHashgSetTwo = new HashSet<>();
	addElements(numberHashgSetTwo);
//		System.out.println("numberHashgSetTwo"+ numberHashgSetTwo);
//		
//		System.out.println("numberHashgSetOne"+numberHashgSetOne);
//		numberHashgSetTwo.addAll(numberHashgSetOne);
//		System.out.println("Union" + numberHashgSetTwo);
		
		//Intersection
		
//		numberHashgSetTwo.retainAll(numberHashgSetOne);
//		System.out.println("Intersection"+numberHashgSetTwo);
		
		//Difference
		numberHashgSetTwo.removeAll(numberHashgSetOne);
		System.out.println("Difference"+numberHashgSetTwo);
		
		
	}

}
