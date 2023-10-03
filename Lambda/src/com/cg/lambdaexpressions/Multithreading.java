package com.cg.lambdaexpressions;
//class Eclips implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("i am eclipse run method");
//		
//	}
//	
//}
public class Multithreading {

	public static void main(String[] args) {
//		Eclips e = new Eclips();
//		Thread obj = new Thread(e);
//		obj.start();
		
		new Thread(()->{System.out.println(" i am eclipse run method");}).start();
		
	}

}
