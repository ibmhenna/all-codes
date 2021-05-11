package com.ibm.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("2");
		stack.push("1");
		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
//LIFO
//push and pop are used