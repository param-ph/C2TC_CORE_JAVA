package com.cg.generic;

public class GenericConstructor {
	private double v;

	public<T extends Number> GenericConstructor(T t) {
		v=t.doubleValue();
	}
	void show() {
		System.out.println("value of  in in double "+ v);
	}
}
