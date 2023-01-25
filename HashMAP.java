package coll.map;

import java.util.HashMap;


//different function from collection interface as it as <key, value> pair
public class HashMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(31, "Siddharth");
		hm.put(20,"Prakash");
		hm.put(99, "Rashmi");
	
		for(int i: hm.keySet()) {
			System.out.print(i+ " " +hm.get(i)+ "\n");	// get to access the value of 'i' key 
		}
		hm.put(99, "Gautam");	// then easier value is replace by this one
		hm.replace(31, "Siddharth", "Sid");
		
		System.out.println("\nSize of the HashMap: "+ hm.size());
		System.out.println(hm);
		System.out.println("The removed element(value) is "+ hm.remove(99));
	}

}
