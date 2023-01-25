package coll.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

//Linked hash set gives the output in the same  order as input
public class LinkedHashSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(66);
		lhs.add(34);
		lhs.add(79);
		lhs.add(55);
		lhs.add(1);
		
		Iterator<Integer> i = lhs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\nIs 55 is present? " + lhs.remove(55) + "\nElement got removed");
		//remove here true if that element present and also perform removal operation
		System.out.println("The hash set is: "+ lhs);
		

	}

}
