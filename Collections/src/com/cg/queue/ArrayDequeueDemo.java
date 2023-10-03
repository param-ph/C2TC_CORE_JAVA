package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		System.out.println(arrayDeque);
		
		arrayDeque.offer("F");
		System.out.println(arrayDeque);
		// for loop
		// for each loop
		//iterator
		// List iterator -- only in list interface - arrayList and linkedList
		//Enumeration - only vector
		
		for(String item:arrayDeque )
		System.out.println(arrayDeque);

	}

}
