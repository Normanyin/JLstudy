package com.geekle.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
		
		String name = input.readUTF();
		double score = input.readDouble();
		java.util.Date date = (java.util.Date)(input.readObject());
		
		System.out.println(name + " " + score + "" + date );
		input.close();
	}
}
