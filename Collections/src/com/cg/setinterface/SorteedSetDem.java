package com.cg.setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SorteedSetDem {

	public static void main(String[] args) {
		TreeSet<String> setObj = new TreeSet<>(Arrays.asList("Java", "Code","Name", "tech", "Quiz", "Game"));
		
//		setObj.add("Tech");
//		setObj.add("Java");
//		setObj.add("Code");
//		setObj.add("Name");
//		setObj.add("Class");
//		setObj.add("Z");
//		System.out.println(setObj);
//		SortedSet<String> beforeName =setObj.headSet("Name");
//		SortedSet<String> afterName =setObj.tailSet("Name");
//		System.out.println("BeforeName:"+beforeName);
//		System.out.println("AfterName:"+afterName);
//		Set<String> subSet= setObj.subSet("Game",false,"Quiz",true);
//		System.out.println(subSet);
	
		String[] strArr = {"one", "two", "three", "four", "four", "five"};
		List<String> tempList = Arrays.asList(strArr);
		TreeSet<String> unique = new TreeSet<>(tempList);
		System.out.println(unique);
		
		

	}

}
