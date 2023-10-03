package com.cg.javaeightfeatures;

public class Hero implements Actor{

	@Override
	public void act() {
		System.out.println("i know to act");
		
	}

	@Override
	public void speak() {
		System.out.println("i know to speak");
		
	}
	
	public void humble() {
		System.out.println(" i am humble");
	}

}
