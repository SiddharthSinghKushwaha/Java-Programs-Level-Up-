package coll.set;

import java.util.HashSet;
import java.util.Iterator;
//No duplicates element allowed in set
//Hashset output is in not in particular order <random oder>
public class HashSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		hs.add(66);
		hs.add(34);
		hs.add(79);
		hs.add(55);
		hs.add(1);
		
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\nIs 55 is present? " + hs.remove(55) + "\nElement got removed");
		//remove here true if that element present and also perform removal operation
		System.out.println("The hash set is: "+ hs);
		
	}

}
