package com.cg.multithreding;
class MyMethod extends Thread {
	public void run() {
	for(int i=0;i<100;i++) {
		System.out.println("you are stupid shahd");
		System.out.println("i love you ");
		try {
			Thread.sleep(2000);
	  }catch (InterruptedException e) {
			System.out.println("Interupted Exception Occured");			
	  }
     }
    }
}
public class Shahd {
	public static void main(String[] args) {
		MyMethod t1 = new MyMethod();
		t1.start();
	}

}
