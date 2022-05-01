package com.collections.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//ListInterface - ArrayList, LinkedList, Vector and Stack are the 4 classes which implement collection framework
//List - is an ordered collection of objects duplicates can be stored
//List interface has methods which should implemented by the all classes.
//This has declaration only as it is a interface
//Object Access - List allows add, remove, get, and set operations



//void add(int index, Object o);
//boolean addAll(int index, Collection C);  //Shifts the order right if there
//remove(index) -- removes the first occurance of the object
//Object get(int Index)
//Object set(int Index,Object newObject)


//SEARCH IN LIST
// int indexOf(object) -- gives the first index of object else -1
// int lastIndexOf(object) -- gives the index of last index of object else -1

//LIST subList(int fromIndex, int toIndex)

public class ListDemo {

	public static void main(String[] args) throws InterruptedException {
			
		List al = new ArrayList();
		List al2 = new ArrayList();
		List ll = new LinkedList();
		List s = new Stack();
		List v = new Vector();
		

		al.add(0, 12);
		al.add(1, 12);
		al.add(24);
		System.out.println(al);
		
		al2.addAll(al);
		System.out.println(al2);
		
		al2.addAll(1,al);
		System.out.println(al2);
		
		al2.remove(5);
		System.out.println(al2);
		
		System.out.println("Get Index at 2 is : "+al2.get(2));
		
		System.out.println("before set : "+al2);
		al2.set(1, 123);
		System.out.println("after set : "+al2);
		
		System.out.println("First Index of 12 is : "+al2.indexOf(12));
		System.out.println("Last Index of 12 is : "+al2.lastIndexOf(12));
		
		
		System.out.println(al2);
		System.out.println("Sub list from 1 and 3 is "+al2.subList(1, 3));
	}
	
}
