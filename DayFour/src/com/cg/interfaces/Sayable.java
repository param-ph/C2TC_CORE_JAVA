package com.cg.interfaces;

public interface Sayable {
	default void say () {
		System.out.println("hello ! this is default method");
	}
	void sayMore(String msg);
}
