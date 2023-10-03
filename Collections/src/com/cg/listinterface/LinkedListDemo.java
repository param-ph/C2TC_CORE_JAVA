package com.cg.listinterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(60);
		ll.add(30);
		ll.add(50);
		ll.addFirst(5);
		ll.add(2, 20);
		ll.addLast(70);
		ll.add(35);
		System.out.println("Number elements "+ll);
//		System.out.println("First Element "+ll.getFirst());
//		System.out.println("Last Element "+ll.getLast());
//		ll.removeFirst();
	//	ll.removeLast();
//		System.out.println("after removing first and last element" +ll);
		
		ListIterator<Integer> li = ll.listIterator();
		while (li.hasNext())
//			System.out.println(li.next() );
		li = ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			int n= li.previous();
			if (n==60) 
				li.add(999);
			if(n==20)
				li.set(1000);
			System.out.println(n);
		}
		
//		Collections.sort(ll);
//		System.out.println("sorted "+ll);		
//		Collections.reverse(ll);
//  	System.out.println("Reversed " +ll);
		
		

	}

}
