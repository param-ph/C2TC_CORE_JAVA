package com.cg.arrays;

public class ClassRoomArray {

	public static void main(String[] args) {
		int[] marks = {10,20,30,40,50};
		System.out.println(marks.length);
		for(int i = 0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		System.out.println("using for each loop");
		for(int element: marks)
			System.out.println(element);
	}
}
