package com.cg.javaeightfeatures;

public interface Actor {
	void act();	
	void speak();
	default void bodyLanguage() {
		System.out.println(" i maintain a good body language");
	}
	
	
}
