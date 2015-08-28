package com.geekle.singleton;

public class TMain {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		singleton1.setName("first");
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setName("second");
		
		singleton1.printInfo();
		singleton2.printInfo();
		
		if (singleton1 == singleton2) {
			System.out.println("they are the same instance");
		} else {
			System.out.println("they are not the same instance");
		}
	}
}
