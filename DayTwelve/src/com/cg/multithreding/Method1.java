package com.cg.multithreding;
class MyThread1 extends Thread {
	@Override
	public void run() {
		int i= 0;
		while(i<100) {
			System.out.println("My thread 1 is running");
			System.out.println("I am happy");
			i++;
		}
	}
}
	class MyThread2 extends Thread{
		public void run() {
			int i = 200;
			while(i<500) {
				System.out.println("My thread 2 is running");
				System.out.println("I am sad");
				i++;
			}
			
		}
	}


public class Method1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();

	}

}
