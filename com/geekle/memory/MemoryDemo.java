package com.geekle.memory;

public class MemoryDemo {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		Integer sometimes[] = new Integer[1000];
		
		System.out.println("Total memory is :" + r.totalMemory());
		
		mem1 = r.freeMemory();
		
		System.out.println("Intial free ,memory:" + mem1);
	}
}
