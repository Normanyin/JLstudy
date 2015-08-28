package com.geekle.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
		
		output.writeUTF("John");
		output.writeDouble(0.4f);
		output.writeObject(new Date());
		
		output.close();
	}
}
