package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;



//Duplicate and null values not allowed hash set
//Does not maintain the order of insertion
//Initial capacity is 16  (hash table having number of buckets 16) and load factor (is a measurement of how full particular hash set is allowed to increase its capacity) 0.75 by default
//LF=no.of stored elements/Size of hash table
//Bucket size increases automatically - this processing is called rehashing
//HashSet uses hash table as data set


public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add("hello");
		hs.add(2);
		hs.add("hello2");
		hs.add(3);
		hs.add("hello3");	
		hs.add("Ayya");	
		hs.add("kot");
		System.out.println(hs);
		
		hs.remove(3);
		
		System.out.println(hs.contains(3));
		System.out.println(hs.contains("hello2"));
		
		System.out.println(hs);
		//hs.clear();
		System.out.println(hs);
		
		Iterator e = hs.iterator();
		System.out.println("Iterating Hash set ");
		while(e.hasNext())
		{
			System.out.println(e.next());
		}
		
	}

}
