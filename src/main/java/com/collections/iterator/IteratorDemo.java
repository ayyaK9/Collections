package com.collections.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class IteratorDemo {

	//Iterator is an interface which is used to iterate over the n number of elements of collection classes
	
	//has three methods
	
	//public boolean hasNext() - which returns true if it has more elements
	
	//public object next() - returns the element and move the cursor to next pointer
	
	//public void remove
	
	// types of Iterator ---- Enumeration , Iterator, ListIterator
	
	
	// Enumeration Iterator  -- used to iterate over the legacy collection i.e before 1.2 or 1.2 vector, HashTable 
	// We have to call the elements of the vector class
	// Enumeration e = v.elements();
	// Has two methods :: 1.hasMoreElements() --  2.nectElement()  - returns nosuchelement if no elements are present
	
	
	
	//ITERATOR is part of iterator interface , Iterator is universal iterator can be used in any collection object
	//Iterator is available for all the collections object
	//Iterator object can be called as .iterator for any Collection c 
	// Iterator i = c.iterator();  -- three methods 1. hasNext, 2. next, 3. remove
	// LIMITATIONS : WE CAN ITERATE IN FORWORD DIRECTION NOT IN REVERSE DIRECTION
	// ADDING AND REPLACING WONT HAPPEN
	
	
	//ListIterator - Bidirectional
	//Applicable only for ArrayList and LinkedList
	//ListIterator i = ListInterfaceclass.iterator()
	//1. hasNext, 2. next, 3. remove 4. nextIndex() 5. hasPrevious() 6. previousIndex() 7. previous() 8. public void set(Object obj) (add or replace)
	
	
	public static void main(String[] args) {

		//Enumerator ----------------------------------------------------------------	

		Vector v = new Vector();

		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		System.out.println("From vector  " +v);

		Enumeration e = v.elements();
		System.out.print("Vector elements is " );
		while (e.hasMoreElements()) {
			
			System.out.print(e.nextElement());
		}
		
		System.out.println();
		
		
		//Array List Iterator ----------------------------------------------------------------		
		ArrayList<String> alString = new ArrayList<String>();
		
		for (int i=1; i<=10;i++){
			alString.add("String "+i);		
		}
		
		Iterator arrayListIterator = alString.iterator();
		System.out.println("Array List items is : ");
		while(arrayListIterator.hasNext())
		{
			String val = arrayListIterator.next().toString();
			System.out.println(val);
			if (val.contains("1")) {
				arrayListIterator.remove();
			}
		}
	
	
		
		
		
		
		// List Iterator----------------------------------------------------------------
		ArrayList al = new ArrayList();

		for (int i = 1; i <= 10; i++) {
			al.add(i);
		}

		ListIterator lstItr = al.listIterator();
		System.out.println();
		System.out.println();
		int i = 0;
		while (lstItr.hasNext()) {
			int val = (Integer) lstItr.next();
			System.out.println("index is : " + lstItr.nextIndex() + "    Index value " + val);

			if (val % 2 == 0) {
				val++;
				lstItr.set(val);
				lstItr.add(val);
			}

		}
		System.out.println("AFTER SET METHOD " + al);
		while (lstItr.hasPrevious()) {
			System.out.println("index is : " + lstItr.previousIndex() + "    Index value " + lstItr.previous());
		}		
		
	}

}
