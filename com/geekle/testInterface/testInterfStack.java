package com.geekle.testInterface;

public class testInterfStack {
	
	public static void main(String[] args) {
		FixedStack fixedStack = new FixedStack(5);
		DynStack dynStack = new DynStack(8);
		
		for (int i = 0; i < 5; i++) {
			fixedStack.push(i);
		}
		
		for (int i = 0; i < 16; i++) {
			dynStack.push(i);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(fixedStack.pop());
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println(dynStack.pop());
		}
	}
}
