package com.collections.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Tree set is the sorted set
//HeadSet
//trailSet
public class TreeSetDemo {
	public static void main(String[] args) {

		LinkedHashSet lhash = new LinkedHashSet();

		lhash.add(122);
		lhash.add(2);
		lhash.add(12);
		lhash.add(2);
		lhash.add(2);
		lhash.add(2);

		ArrayList lstToSort = new ArrayList();

		lstToSort.add(122);
		lstToSort.add(2);
		lstToSort.add(12);
		lstToSort.add(2);
		lstToSort.add(2);
		lstToSort.add(2);

		TreeSet treeAL = new TreeSet(lstToSort);

		System.out.println("Array list to tree set: "+treeAL);
		TreeSet set = new TreeSet();

		set.add(123);
		set.add(123);
		set.add(221);
		set.add(14);
		set.add(126);
		set.add(0);
		set.add(1);
		set.add(2);

		System.out.println(set);
		
		System.out.println("HeadSet : "+set.headSet(14));
		System.out.println("trail of  : "+set.tailSet(14));
		
		System.out.println("trail of  : "+set.subSet(14, 127));
		
		
	}

}
