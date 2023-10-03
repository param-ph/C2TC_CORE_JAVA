package com.cg.abstractclass;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal tiger = new Carnivore();
		Animal cow = new Herbivores();
		Animal cat = new Omnivores();
		cow.eat();
		tiger.eat();
		cat.eat();
	}

}
