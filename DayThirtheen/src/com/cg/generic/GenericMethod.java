package com.cg.generic;

public class GenericMethod {
public<E> void displyArrayElements(E[] elements) {
	for(E a: elements) {
		System.out.println(a);
	}
}

void show (int i) {
	System.out.println(i);
}

void display(Person p) {
	System.out.println(p);
}
}
