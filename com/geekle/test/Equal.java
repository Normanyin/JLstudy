package com.geekle.test;

public class Equal {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1;
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
		s1 = "hello world";
		if (s1 == s2) {
			System.out.println("they are equal");
			System.out.println("s1:" + s1 + "s2:" + s2);
		} else {
			System.out.println((Object)s1);
			System.out.println((Object)s2);
		}
	}
}
