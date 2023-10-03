package com.cg.abstractclass;
import java.util.Scanner;
public class MyMovie extends Movies {

	
	 public String setTitle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the movie name");
		String title = sc.nextLine();
		 return title;
		
		
	}
	

}
