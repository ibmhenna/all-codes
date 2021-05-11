package com.ibm.sortedset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
//		Set<String> names = new TreeSet<String>();
		Set<String> names1 = new HashSet<String>();
		for (int i = 0; i < 30; i++) {
//			names.add("Ram");
//			names.add("Ajay");
//			names.add("Raj");
			
			names1.add("Ram");
			names1.add("Ajay");
			names1.add("Raj");
		}
		System.out.println(names1);
	}

}
//in has set, elements are not in sorted order
//if there are same elements added, it is considered as single object
//elements in treeset are always sorted in the ascending order