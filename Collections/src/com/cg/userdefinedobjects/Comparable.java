package com.cg.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList <>();
		studentList.add(new Student("Param",26,94));
		studentList.add(new Student("Akash",21,88));
		studentList.add(new Student("waseem",98,67));
		studentList.add(new Student("Sudeep",35,98));
		studentList.add(new Student("Bhaskar",8,55));
		Collections.sort(studentList);
		System.out.println(studentList);
		

	}

}
