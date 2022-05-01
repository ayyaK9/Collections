package com.collections.set;

import java.util.LinkedHashSet;

//maintains doubly linked list across
//Linked hash set is the ordered version of hash set
//Maintains the order
//Only contains unique value and does have one nll value
public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet  lhash = new LinkedHashSet();
		
		lhash.add(123);
		lhash.add(123);
		lhash.add(221);
		lhash.add(14);
		lhash.add(126);
		lhash.add("hello");
		lhash.add("Java");
		lhash.add("ayya");
		lhash.add("0");
		lhash.add(null);
		
		System.out.println(lhash);
	}

}
