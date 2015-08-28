package com.geekle.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main (String[] args) throws IOException {
		File file = new File("");
		System.out.println(file.getAbsolutePath());
	}
}
