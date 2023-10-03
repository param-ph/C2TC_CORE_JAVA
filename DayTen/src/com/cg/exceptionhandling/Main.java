package com.cg.exceptionhandling;

public class Main {
       static void splitString(String text) {
		try {
		String[] splittedString = text.split("/");
		for(int i=0;i<splittedString.length; i++) {
			System.out.println("Splitted string at index: "+i+" is "+splittedString[i]);
			}
		}catch(Exception e){
			System.out.println("Exception"+e);
		}
		finally {System.out.println("inside finally block");
		}
	}
	
	}

