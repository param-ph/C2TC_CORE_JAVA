package com.cg.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i<5; i++)
		q.add(i);
		System.out.println(q);
		//remove
		int removedel= q.remove();
		System.out.println(q);
		
		// head of queue
		int head = q.peek();
		System.out.println(head);
		
		int delete = q.poll();
		System.out.println(delete);
		System.out.println(q);
		
		System.out.println(q.size());

	}

}
