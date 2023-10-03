package com.cg.mapinterface;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<Character,String> sd = new TreeMap<>();
		sd.put('d', "dora");
		sd.put('c', "Charle");
		sd.put('b', "Barbie");
		sd.put('a', "Angel");
		sd.put('e', "Emy");
		sd.put('t', "Tommy");
		sd.put('j', "Jerry");
		sd.put('b', "Barbie");
		System.out.println(sd);
		System.out.println(sd.subMap('b', 'e'));
		NavigableMap<Character,String> n1 = sd.descendingMap();
		System.out.println(n1);
		System.out.println(sd.headMap('c'));
		System.out.println(sd.tailMap('c'));
		
		SortedMap<Character, String> a1 = new TreeMap<>();
		a1 = sd.headMap('c');
		System.out.println(a1);
		SortedMap<Character, String> a2 = new TreeMap<>();
		a2 = sd.tailMap('c');
		System.out.println(a2);

	}

}
