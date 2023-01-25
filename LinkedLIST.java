package coll.list;

import java.util.LinkedList;
import java.util.Iterator;


public class LinkedLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(99);
		li.addLast(6);	//add element to last node of linked list, it is equivalent to 'add'
		
		Iterator<Integer> i = li.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		li.addFirst(31);	// insert at the beginning of the list
		System.out.println("\nThe first element is "+ li.getFirst());	// get first
		System.out.println("The Last element "+ li.getLast());		// get last
		
		li.remove();	// the first element is removing
		System.out.println("After removing, Linked list is "+ li);
		li.removeLast();	// the last element is removing
		System.out.println("After removing again, Linked list is "+ li);
		li.add(99);
		li.addFirst(34);
		li.addLast(55);
		li.add(22);
		
		System.out.println();
		for(int j: li)
			System.out.print(j + " ");
	}

}
