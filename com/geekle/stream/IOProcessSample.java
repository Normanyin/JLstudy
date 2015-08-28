package com.geekle.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOProcessSample {
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		File directory = new File("");
		try {
			System.out.println(directory.getCanonicalPath());
			System.out.println(directory.getAbsolutePath());
			System.out.println(directory.getPath());
		} catch (Exception e) {
			// TODO: handle exception
		}
		// create a file based on the first command-line argument to the program
		File file = new File("/home/geekle/Workspaces/JLstudy/iotest.txt");
		
		// create buffered reader from the standard input
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		try {
			
			// create a print write to write on a file
			//printWrite is required to handled the IO exception
			PrintWriter out = new PrintWriter(file);
			while ((str=in.readLine())!=null) {
				out.println(str);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
