package com.cg.setinterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Integer> lhSet = new LinkedHashSet<>();
		lhSet.add(10);
		lhSet.add(20);
		lhSet.add(30);
		lhSet.add(40);
		lhSet.add(50);
		lhSet.add(50);
		lhSet.add(null);
		lhSet.add(null);
		
		System.out.println(lhSet);
		Set<Student> lhSetOne = new LinkedHashSet<>();
		lhSetOne.add(new Student(1,"Lekha"));
		System.out.println(lhSetOne);
		
		Object[] arr = lhSetOne.toArray();
		for(Object e : arr)
			System.out.println(e);
		
	}

}
