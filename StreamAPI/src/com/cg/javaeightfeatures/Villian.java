package com.cg.javaeightfeatures;

public class Villian implements Actor{

	@Override
	public void act() {
		System.out.println("i know to act");
		
	}

	@Override
	public void speak() {
		System.out.println("i know to speak");
		
	}
	
	public void cruel() {
		System.out.println("i am cruel");
	}
	
}
