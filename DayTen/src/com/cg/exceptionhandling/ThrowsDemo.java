package com.cg.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {
	void myMethod(int num) throws IOException, ClassNotFoundException  {
		if(num==1)
			throw new IOException ("IO Exception occured");
		else
			throw new ClassNotFoundException("Class Not Found Exception Occured");
	}

	public static void main(String[] args) {
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.myMethod(1);
		} catch (ClassNotFoundException|IOException e) {
			
			System.out.println(e);
		}
	}

	}
