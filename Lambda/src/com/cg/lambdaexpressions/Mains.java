package com.cg.lambdaexpressions;

import java.util.ArrayList;

public class Mains {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
//		for (Object a : al) {
//			System.out.println(a);
//		}
		al.forEach(a -> System.out.println(a));
	}

}
