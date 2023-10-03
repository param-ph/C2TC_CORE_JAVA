package com.cg.javaeightfeatures;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteration {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6);
		 
		System.out.println("---- For loop----");
		for(int i=0;i<=5;i++)
			System.out.println(list.get(i));
		
		System.out.println("---- For each Loop----");
		for(Integer i : list)
			System.out.println(i);
		
		System.out.println("---- Iterator Output----");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("---- List Iterator Output----");
		ListIterator<Integer> listItr = list.listIterator();
		while(listItr.hasNext())
			System.out.println(listItr.next());
		
		
		System.out.println("----Internal iteration----");
		list.forEach(values-> System.out.println(values));
		
		
	}

}
