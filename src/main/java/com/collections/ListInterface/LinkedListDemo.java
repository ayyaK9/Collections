package com.collections.ListInterface;

import java.util.LinkedList;

//Difference between Linked list and array list is how they are storing the data
//this also allows duplicated and maintains order like arrayList

//ArrayList - Uses ""backing array"" (data structure) approach  means every element has own index number and we are adding one after the other
//LinkedList - ""doubly Linked list""" - individual location addresses where 1st element contains the pointer of 2nd and 2nd stores the pointer of 1st and 3rd
//two way pointing overal value has 3 parts.


//Extra OPerations
//addFirst()
//allLast()
//removeFirst()
//removeLast()

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add("onetwothree");
		ll.add("four five six");
		ll.add(5);
		ll.add(6);
		
		System.out.println(ll);
		
		ll.addFirst("addingFirst");
		ll.addLast("addingLast");
		
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
	}
}
