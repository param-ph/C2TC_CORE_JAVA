package com.cg.abstractclass;

public abstract class Bike1 {
	 Bike1(){
		System.out.println("Bike is created");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");
	}
	
	
}
