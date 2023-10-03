package com.cg.listinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> ListOne = new ArrayList<>();
//		ListOne.add(null);
//		System.out.println(ListOne.size());
//		System.out.println(ListOne.isEmpty());
//		List can accept duplicate
//		maintain order of input
//		accept null/all type of inputs
		ListOne.add(30);
		ListOne.add(20);
		//ListOne.add(true);
		//ListOne.add(false);
		ListOne.add(10);
		//ListOne.add("hello");
		//ListOne.add(56.78);
		//ListOne.add(5,"Hi");
		ListOne.add(40);
//		System.out.println(ListOne.contains(15));
//		ListOne.remove(false);
//		System.out.println(ListOne);
//		ListOne.remove(1); // int - index
//		System.out.println(ListOne);
//		ListOne.get(5);
//		System.out.println(ListOne.get(2));
//		System.out.println(ListOne.indexOf(20));
//		System.out.println(ListOne.lastIndexOf(20));
		Collections.sort(ListOne);
//		System.out.println(ListOne);
		//ListOne.removeAll(ListOne); // not right method
//		System.out.println(ListOne);
		
		List ListTwo = new ArrayList();
		ListTwo.add(10);
		ListTwo.add(true);
		ListTwo.add(false);
//		ListOne.removeAll(ListTwo);
//		System.out.println(ListOne);
//		ListOne.clear();
//		System.out.println(ListOne);
		Iterator<Integer> e = ListOne.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}

	}

}
