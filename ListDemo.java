package com.revature.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*NO FIXED SIZE CAN ADD AS MUCH AS YOU WANT
		//HETERO MEANING IT CAN HAVE DIFFERENT DATATYPES IN ONE COLLECTION: STRING, INT, BOOLEAN, ETC.
		//TO LIMITE WHAT A LIST CAN CONTAIN USE GENERICS: List<String> myList = new ArrayList<String>();
		MAKE SURE TO USE WRAPPER CLASS WHEN DOING THIS
	    */
	List <String> myList = new ArrayList<String>();	
	myList.add("Blaine");
	myList.add("Aaliyah");
	myList.add("Sasha");
	myList.add("Bryce");
	myList.add("Aaliyah");
	
	//DISPLAYS ENTIRE LIST AT ONCE
	System.out.println(myList);
	
	//DISPLAYS ONE BY ONE
	for(int i = 0; i < myList.size(); i++)
		System.out.print(myList.get(i) + ", ");
	
	//2nd WAY TO DISPLAY -- USING AN ITERATOR
	Iterator myListItr = myList.iterator();
	System.out.println("\n" + "Iterator: ");
	while(myListItr.hasNext())
		System.out.print(myListItr.next() + ", ");
	
	//3RD WAY -- USING ENHANCED FOR LOOP
	//MUST ENSURE LIST HAS A SPECIFIC TYPE (List<String>)
	System.out.println("\n" + "Enhanced for loop:");
	for(String s : myList)
		System.out.print(s + ", ");
	
	//LINKED LIST
	LinkedList<Integer> myList2 = new LinkedList();
	myList2.add(3);
	myList2.add(23);
	myList2.add(5);
	myList2.add(8);
	myList2.add(14);
	System.out.println("\n" + "LinkedList: ");
	for(int i : myList2)
	System.out.print(i + ", ");
	
	//PRINTING LINKED LIST USING ITERATOR
	Collections.sort(myList2);
	System.out.println("\n" + "LinkedList using iterator: ");
	Iterator ite  = myList2.iterator();
	while(ite.hasNext())
		System.out.print(ite.next() + ", ");
	
	//TESTING THE ADD ALL FEATURE
	//THIS COMBINES A LIST WITH ANOTHER LIST
	List<String> myList3 = new ArrayList<String>();
	myList3.add("Mom");
	myList3.add("Dad");
	myList.addAll(myList3);
	System.out.println("\n");
	for(String s : myList)
		System.out.print(s + ", ");
	
	}

}
