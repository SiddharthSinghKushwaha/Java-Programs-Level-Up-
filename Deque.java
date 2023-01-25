package coll.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deque has the ability to perform dequeue and enqueue both the end 
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(2);
		dq.addFirst(3);	// add element to first of the queue
		dq.addLast(5);		// add element to last of the queue
		dq.addFirst(4);
		
		Iterator<Integer> i = dq.descendingIterator();
		Iterator<Integer> i2 = dq.iterator();
		System.out.println("To print in reverse order:");
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
		System.out.println("\nTo print in same order as given input:");
		while(i2.hasNext()) {
			System.out.print(i2.next() + " ");
		}
		System.out.println("\nDeleting the last element of the queue: "+ dq.removeLast());
		System.out.println("Deleting the first element of the queue: "+ dq.removeFirst());
		System.out.println("Size of the Deque: "+ dq.size());
		//	dq.peek(),dq.peekFirst();dq.peekLast(); dq.poll(), dq.pollFirst(), dq.pollLast();
		//	dq.offer(), dq.offerFirst(); dq.offerLast();		
	}

}
