package com.ibm;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int j = 0; j < 500; j++) {
			names.add("Ram"+j);
		}
		
//		System.out.println(names);
		
		//to sort in ascending order
		
		names.sort(new Comparator<String>(){
		
			@Override
			public int compare(String o1, String o2) {
				int value2 = Integer.valueOf(o2.substring(3)); //obtaining the integer value for sorting
				int value1 = Integer.valueOf(o1.substring(3));
				return value2 - value1;
			}
		});
			
		System.out.println(names);
	}
}
