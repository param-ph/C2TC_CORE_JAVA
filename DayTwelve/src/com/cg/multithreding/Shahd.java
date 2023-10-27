package com.cg.multithreding;
class MyMethod extends Thread {
	public void run() {
	for(int i=0;i<100;i++) {
		System.out.println("Param");
		//System.out.println("i love you ");
		try {
			Thread.sleep(500);
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
