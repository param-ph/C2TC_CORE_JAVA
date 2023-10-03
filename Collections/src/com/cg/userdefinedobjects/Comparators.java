package com.cg.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparators {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Param","Gani"));
		personList.add(new Person("Ravi","Banglore"));
		personList.add(new Person("Basu","Bijapura"));
		personList.add(new Person("Shahd","Egypt"));
		System.out.println("---- Before sorting ----");
		System.out.println(personList);
		System.out.println("---- Sorting with respect to city ----");
		Collections.sort(personList, new SortByCity());;
		System.out.println(personList);
		System.out.println("----Sorting with respect to name----");
		Collections.sort(personList, new SortByName());;
		System.out.println(personList);
		
	}

}
