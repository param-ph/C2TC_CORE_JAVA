package com.cg.lambdaexpressions;

public class DrawVariable  {

	public static void main(String[] args) {
		Drawable d = (int radius) -> {
			System.out.println("Circle is drawn with radius "+ radius);
		};
		d.draw(10);
	}

	
		
	}

