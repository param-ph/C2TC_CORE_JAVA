package com.cg.userdefinedobjects;

import java.lang.Comparable;

public class Student implements Comparable<Student>{
	private String name;
	private int rollno;
	private float per;
	
	public Student () {
		super();
		
	}

	public Student(String name, int rollno, float per) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.per = per;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", per=" + per + "]";
	}

	

	public int compareTo(Student o) {
		
		//return (int)(this.per-o.per); //ASC
		//return (int)(o.per-this.per); //DSC
		//return this.name.compareTo(o.name); // ASC
		return o.name.compareTo(this.name); // DSC
	}

}


