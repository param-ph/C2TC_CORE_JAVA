package com.cg.generic;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		GenericConstructor gc = new GenericConstructor(10);
		gc.show();
		GenericConstructor gcOne = new GenericConstructor(10.555F);
		gcOne.show();
	}

}
