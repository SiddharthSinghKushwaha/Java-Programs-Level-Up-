package coll.list;
//list allows duplicate element but set doesn't. 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(65);
		ar.add(31);
		
		System.out.println("Size of the array list: "+ ar.size());
		System.out.println("Elements are: ");
		Iterator<Integer> i = ar.iterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		ar.remove(1);	//remove element at index 1
		System.out.println("\nAfter removing one element\n size: "+ ar.size()+ "\n Elements "+ ar);
		
		ar.add(0, 23);	//add element 23 at 0th index and shift others to right
		ar.add(45);
		ar.add(68);
		
		System.out.println("Does ArrayList contains my roll numver? "+ ar.contains(31));	// to check if something is present or not
		
		System.out.println("Before updating: "+ ar);
		ar.set(3, 300);	//to update 300 a index 3
		System.out.println("After updating: "+ ar);
		
		System.out.println("The array list is: ");
		for(int j=0; j<ar.size(); j++)
			System.out.print(ar.get(j) + " ");	//to access each element of array list
		
		Collections.sort(ar);
		System.out.println("\nThe sorted array list: ");
		for(int j : ar) {	// use of 'for each' loop
			System.out.print(j + " ");
		}
		
		ar.clear();	//to clear/remove all the elements from array list
		System.out.println("\nAfter clearing the array list: "+ ar);
		
	}
}
