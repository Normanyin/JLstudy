package com.geekle.test;

public class StringToInt {
	public static void main(String[] args) {
		String numString = "9999999991";
		long num = Integer.valueOf(numString, 16);
		System.out.println(num);
	}
}
