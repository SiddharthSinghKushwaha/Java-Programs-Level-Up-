package coll.map;

import java.util.TreeMap;

//provide result in sorted order according to key
public class TreeMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(31, "Siddharth");
		tm.put(20,"Prakash");
		tm.put(99, "Rashmi");
	
		for(int i: tm.keySet()) {
			System.out.print(i+ " " +tm.get(i)+ "\n");	// get to access the value of 'i' key 
		}
		tm.put(99, "Gautam");	// then easier value is replace by this one
		tm.replace(31, "Siddharth", "Sid");
		
		System.out.println("\nSize of the HashMap: "+ tm.size());
		System.out.println(tm);
		System.out.println("The removed element(value) is "+ tm.remove(99));
	}

}
