package com.ibm.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("1");
		queue.add("1");
		System.out.println(queue.toArray());
		System.out.println(queue.size());
	}
}
