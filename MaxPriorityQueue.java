package coll.queue;

import java.util.Queue;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		q.add(2);
		q.offer(4);	// to add element 
		q.offer(2);
		q.add(1);
		q.offer(6);
		q.add(3);
		
		Iterator<Integer> i = q.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\nThe peek of the queue is "+ q.peek());
		q.poll();
		System.out.println("\nThe peek of the queue is "+ q.peek());
	}

}
