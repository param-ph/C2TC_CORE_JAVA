package com.cg.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {

	public static void main(String[] args) {
		List ListOne = new ArrayList();
		ListOne.add(10);
		ListOne.add(20);
		ListOne.add(true);
		ListOne.add(false);
		ListOne.add(10.58);
		ListOne.add("Hi");
		ListOne.add(20);
		ListOne.add("Hello");
		ListOne.add(20);
		System.out.println(ListOne);
		System.out.println(ListOne.indexOf(20));
		System.out.println(ListOne.lastIndexOf(20));
	}

}
