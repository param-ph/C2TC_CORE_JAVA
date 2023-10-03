package com.cg.multithreding;
class MyMethod1 implements Runnable{

	@Override
	public void run() {
		int i = 1;
		while(i<200) {
		System.out.println(" I am thread 1 ");
		System.out.println(" i am ready ");
		i++;
		}
	}
	
}
class MyMethod2 implements Runnable{

	@Override
	public void run() { 
		int i = 0;
		while(i<300) {
		System.out.println("I am thread 2");
		System.out.println("I am not ready ");
		i++;
		}
	}
	
}
public class Method2 {

	public static void main(String[] args) {
		MyMethod1 task1 = new MyMethod1();
		MyMethod2 task2 = new MyMethod2();
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();

	}

}
