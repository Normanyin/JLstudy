package com.geekle.singleton;

//懒汉式单例类，只在第一次调用的时候实例化自己
public class Singleton {
	
	String name = null;
	//私有的默认构造
	private Singleton() {
		
	}
	
	
	private static Singleton singleton = null;
	
	//静态工厂方法
	public static Singleton getInstance() {
		if (singleton ==null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("the "+ singleton.getClass().getName()+ " is " + name);
	}
	
}
