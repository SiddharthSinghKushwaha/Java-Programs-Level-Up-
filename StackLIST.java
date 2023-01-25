package coll.list;

import java.util.Stack;
import java.util.Iterator;

public class StackLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> s = new Stack<Double>();
		if(s.empty())	//return true if stack is empty
			System.out.println("The stack is empty");
		
		s.push(300.1);
		s.push(23.6);
		s.push(4.675);;
		s.push(45.6);
		s.push(22.99);
		
		if(s.empty())
			System.out.println("The stack is empty");
		else {
			 
			System.out.println("Elements of stack are: ");
			Iterator<Double> i = s.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
		
		System.out.println("Peek element is: "+ s.peek());
		System.out.println("The pop element is: "+ s.pop());
		System.out.println("Peek element is: "+ s.peek());
		
		int found = s.search(23.6);	//return distance from top of the stack
		if(found == -1)				// return -1 if element is not present
			System.out.println("Searched element not found ");
		else
			System.out.println("Element is at position "+ found + " from the top of the stack");
	}

}
