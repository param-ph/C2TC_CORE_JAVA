package com.cg.multithreding;

public class LambdaExpression {

	public static void main(String[] args) {
		Runnable obj1 = new Runnable()
			{
				public void run()
			  {
				for(int i =1; i<=5; i++) 
				{
					System.out.println("Hello");
					try{Thread.sleep(500);}catch(Exception e) {}
				}
		      }
			};
			
		Runnable obj2 = new Runnable()
				{
					public void run() 
					{
						for(int i=1; i<=5;i++) 
						{
							System.out.println("Hii");
							try {Thread.sleep(500);} catch(Exception e) {}
						}
					}
				};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setName("Hello");
		t2.setName("Hi");
		System.out.println("Thread name: "+t1.getName());
		System.out.println("Thread name: "+ t2.getName());
		t1.start();
		t2.start();
		try{t2.join();
		t1.join();}catch(Exception e) {}
		
		System.out.println("Both the threads are terminated");
	}
}
				
					
		
		
	


