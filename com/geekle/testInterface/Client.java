package com.geekle.testInterface;

public class Client implements Callback{
	public void callback(int para) {
		System.out.println("callback with " + para);
	}
	
	void print(){
		System.out.println("invoke print method");
	}
}
