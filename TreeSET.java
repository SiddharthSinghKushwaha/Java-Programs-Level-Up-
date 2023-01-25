package coll.set;

import java.util.TreeSet;
import java.util.Iterator;

//Tree set always gives output in sorted order
public class TreeSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(66);
		ts.add(34);
		ts.add(79);
		ts.add(55);
		ts.add(1);
		
		Iterator<Integer> i = ts.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\nIs 55 is present? " + ts.remove(55) + "\nElement got removed");
		//remove here true if that element present and also perform removal operation
		System.out.println("The hash set is: "+ ts);
	}

}
