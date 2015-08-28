package com.geekle.singleton;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;

public class Singleton2 {
	private static Map<String, Singleton2> map = new HashMap<String,Singleton2>();
	static{
		Singleton2 singleton2 = new Singleton2();
		map.put(singleton2.getClass().getName(), singleton2);
	}
	
	protected Singleton2() {
		
	}
	
	public static Singleton2 getInstance(String name) {
		if (name == null) {
			name = Singleton2.class.getName();
			System.out.println("name == null" + "--->name=" + name);
		}
		
		if (map.get(name) == null) {
			try {
				map.put(name, (Singleton2) Class.forName(name).newInstance());
			} catch (InstantiationException | IllegalAccessException
					| ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return map.get(name);
	}
	
	public String about() {
		return "Hello, I am regSingleton";
	}
	
	public static void main(String[] args) {
		Singleton2 singleton2 = Singleton2.getInstance(null);
		System.out.println(singleton2.about());
	}
}
