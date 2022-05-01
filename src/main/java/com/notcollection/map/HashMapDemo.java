package com.notcollection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Allows null key once and multiple null values
//Hash node contains 4 values: 1. Hash, 2. Key, 3. Value, 4. Next value of next node
//add doesnot work we need to have put value since it is not part of collections FW
public class HashMapDemo {
public static void main(String[] args) {
	HashMap hash_map2 = new HashMap();
	
	HashMap<Integer, String> hash_map = new HashMap<Integer,String>();
	
	hash_map.put(1, "String 1");
	hash_map.put(2, "String 52");
	hash_map.put(3, "String 233");
	hash_map.put(4, "String 1");
	hash_map.put(5, "String 1");
	
	
	System.out.println(hash_map);
	System.out.println();
	if (hash_map.containsKey(4))
	{
		System.out.println(hash_map.containsKey(4));
		System.out.println(hash_map.get(4));
	}
	
	System.out.println(hash_map.size());
	//hash_map.clear();
	System.out.println(hash_map.isEmpty());
	
	Iterator it = hash_map.entrySet().iterator();
	
	while(it.hasNext())
	{
		Map.Entry each = (Entry) it.next();
		System.out.println(each.getValue());
		System.out.println(each.getKey());
	}
	
	Set keySet = hash_map.keySet();
	
	Iterator setIt = keySet.iterator();
	
	while(setIt.hasNext())
	{
		System.out.println(hash_map.get(setIt.next()));
	}
	
}
}
