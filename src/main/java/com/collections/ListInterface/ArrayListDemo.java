package com.collections.ListInterface;

import java.util.ArrayList;

//All operations of List interface can be user for Array List
//ArrayList is a dynamic array - we no need to define the size unlike array 
//Generic arraylist - accepts only the object type <OB> declared
// Add, Get or remove objects at run time

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(32);
		arrayList.add(42);
		arrayList.add(52);
		arrayList.add(62);
		arrayList.add(72);
		arrayList.add(72);
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
}
}