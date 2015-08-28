package com.geekle.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regtest {
	public static void main(String[] args) throws IOException{
		File file = new File("/home/geekle/Workspaces/JLstudy/test.java");
		StringBuffer buffer = new StringBuffer();
		String line = null;
		InputStream is = new FileInputStream(file);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
		try {
			line = reader.readLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (line != null) {
			buffer.append(line);
			buffer.append("\r\n");
			try {
				line = reader.readLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String filecontent = buffer.toString();
		String regSrc = "\\/\\*.*?\\*\\/";
		String str = "";
		Matcher m =null;
		Pattern pat = Pattern.compile(regSrc,Pattern.DOTALL);
		m = pat.matcher(filecontent);
		str = m.replaceAll("");
		System.out.println(str);
	}
}
