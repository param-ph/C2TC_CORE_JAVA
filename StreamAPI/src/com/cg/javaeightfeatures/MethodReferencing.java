package com.cg.javaeightfeatures;

import java.util.Arrays;
import java.util.List;
		class Doubleit{
			static void doubleit(int i) {
				System.out.println(i*2);
			}
		}
public class MethodReferencing {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6);
		System.out.println("Collection out put" + list);
		System.out.println("---- internal iteration");
		list.forEach(val -> System.out.println(val));
		
		System.out.println("---- Method referencing----");
		list.forEach(System.out::println);
		System.out.println("---MEthod referencing output- user defined ----");
		list.forEach(Doubleit::doubleit);
	}

}
