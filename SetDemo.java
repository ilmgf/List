package com.revature.collections.examples;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SET HAS SAME METHODS AS LIST BUT CANNOT HAVE DUPLICATES
		Set<String> mySet = new HashSet<String>();
		
		System.out.println("\n" + "Hashset:");
		mySet.add("Blaine");
		mySet.add("Aaliyah");
		mySet.add("Soundcloud");
		mySet.add("Zorful");
		mySet.add("Dora");
		
		//NO SPECIFIC ORDER OF ITERATION FOR HASHSET
		
		for(String s : mySet)
			System.out.print(s + ", ");
			
		Set<String> mySet2 = new TreeSet<String>();
		mySet2.add("Blaine");
		mySet2.add("Aaliyah");
		mySet2.add("Soundcloud");
		mySet2.add("Zorful");
		mySet2.add("Dora");	
		
		//PUTS ELEMENTS IN ORDER (SORTS ELEMENTS)
		//IN THIS CASE ALPHABETICAL ORDER
		System.out.println("\n" + "TreeSet:");
		for(String s2 : mySet2) 
			System.out.print(s2 + ", ");
		
	}

}
