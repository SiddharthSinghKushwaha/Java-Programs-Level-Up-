package coll.list;

import java.util.Vector;
import java.util.Iterator;

public class VectorLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>(12);	// by default capacity is 10 but we can also explicitly mention
		Vector<Integer> v1 = new Vector<Integer>(); // here the capacity is 10
		System.out.println("Capacity of string vector " + v.capacity());
		System.out.println("Capacity of integer vector " + v1.capacity());
		
		v.add("Siddharth");
		v1.add(31);
		v.add("Rashmi");
		v1.add(99);
		
		Iterator<String> is = v.iterator();
		Iterator<Integer> ii = v1.iterator();
		
		System.out.println("Name\tRollno" );
		while(is.hasNext() && ii.hasNext()) {
			System.out.println(is.next() + " " + ii.next());
		}
		System.out.println("The first elements of vector list is "+ v1.firstElement());
		v1.add(1,  20);
		v1.add(3,  20);
		System.out.println("The first occurence of 20 is "+ v1.indexOf(20));
		System.out.println("The occurence of 20 after 2 index is "+ v1.indexOf(20, 2));
		System.out.println("The last occurence of 20 is "+ v1.lastIndexOf(20));
		
		System.out.println("The removed element is "+ v1.remove(2));
		System.out.println("The vector list<Integer>: "+ v1 + "\nThe vector<String>: " + v);
		
	}

}
