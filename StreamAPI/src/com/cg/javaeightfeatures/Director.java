package com.cg.javaeightfeatures;

public class Director {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.act();
		h.speak();
		h.humble();
		h.bodyLanguage();
		
		Villian v = new Villian();
		v.act();
		v.speak();
		v.cruel();
		v.bodyLanguage();

	}

}
