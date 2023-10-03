package com.cg.generic;

public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer[] intarray= {10, 20, 30, 40};
		String[] str = {"Java programming"};
		GenericMethod gm = new GenericMethod();
		gm.displyArrayElements(intarray);
		gm.displyArrayElements(str);
		

	}

}
