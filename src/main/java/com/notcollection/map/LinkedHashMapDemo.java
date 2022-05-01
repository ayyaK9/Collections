package com.notcollection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

//Linked HashMap maintains the insertion order

public class LinkedHashMapDemo {
public static void main(String[] args) {
	
	LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<String, Integer>();
	
	lhmap.put("Ayya", 1);
	lhmap.put("kot", 2);
	lhmap.put("kot", 1);
	lhmap.put("hi", 3);
	lhmap.put("john", 4);
	lhmap.put("hellooo", 5);
	
	System.out.println(lhmap);
	System.out.println(lhmap.isEmpty());
	System.out.println(lhmap.size());
	System.out.println(lhmap.containsKey("Ayya"));
	
	Set setEntries =  lhmap.keySet();
	Iterator itrKeySet = setEntries.iterator();
	
	while(itrKeySet.hasNext())
	{
		String key = (String) itrKeySet.next();
		System.out.print("Key is : "+key+" value : ");
		System.out.print(lhmap.get(key));
		System.out.println();
	}
	
}
}
