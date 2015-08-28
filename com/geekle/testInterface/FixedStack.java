package com.geekle.testInterface;

//An implementation of IntStack that uses fixed storage.
public class FixedStack implements IntStack{
	private int stck[];
	private int tos;
	
	//allocate and initialize stack
	public FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	// push an item onto the stack
	@Override
	public void push(int item) {
		if (tos == stck.length-1) {
			System.out.println("the stack is full!");
		}else {
			stck[++tos] = item;
		}
	}
	
	// pop an item from the stack
	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("the stack is empty!");
			return 0;
		}else {
			return stck[tos--];
		}
	}
	
	
}
