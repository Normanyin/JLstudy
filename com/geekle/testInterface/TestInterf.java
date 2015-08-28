package com.geekle.testInterface;

public class TestInterf extends Client{
	public static void main(String[] args) {
		Client client = new  Client();
		client.callback(3);
		client.print();
		
	}
}
