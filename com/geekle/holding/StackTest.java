package com.geekle.holding;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		for (String string : "My dog has fleas".split(" ")) {
			stack.push(string);
		}
		
		while (!stack.empty()) {
			System.out.println(stack.pop() + " ");
		}
	}
}
