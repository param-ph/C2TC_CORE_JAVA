package com.cg.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name","Param");
		map.put("Occupation","Engineer");
		map.put("Country","India");
		
		System.out.println(map);
		
		Map<Integer,String> mapOne = new HashMap<Integer,String>();
		mapOne.put(10,"Anil");
		mapOne.put(20,"Kamal");
		mapOne.put(30,"Reshma");
		mapOne.put(40,"Savita");
		System.out.println(mapOne);
		
		Map<Integer,String> mapTwo = new HashMap<Integer,String>();
		mapTwo.putAll(mapOne);
		System.out.println(mapTwo);
		System.out.println(mapTwo.containsValue("Kamal"));
		System.out.println(map.get("Occupation"));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		map.remove("Name");
		System.out.println(map);
		System.out.println("---- Iterator ----");
		map.put("Name", "Param");
		Iterator<String> keySetIterator = map.keySet().iterator();
		while(keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			System.out.println(key+ "-" +map.get(key));
		}
		
		
		
	}

}
