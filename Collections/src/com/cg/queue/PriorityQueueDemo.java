package com.cg.queue;
import java.util.Iterator;
// task 1 priority in which stored 
// Extension of dequeue(double ended queue)
// diff btw add and offer
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		pq.add("core Java");
		pq.add("React");
		pq.add("hTML");
		pq.add("Anglar");
		System.out.println(pq);
		System.out.println(pq.size());
		
		
		Iterator<String> iterator =pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
