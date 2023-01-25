package coll.queue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class MinPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<>();	//minimum priority queue <min heap> is used
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
		System.out.println("\nThe peek of minimum priority queue is: "+ q.peek());
		System.out.println("The size of the queue: "+ q.size());
		//removing all element one by one and printing it
		for(int j=0; j<q.size(); j++) {
			System.out.println(q.remove());	// to remove it from queue, we use poll
			
		}
		System.out.println("\nThe remaining elements of priority: "+ q + "\nsize: "+ q.size());
		
	}

}
