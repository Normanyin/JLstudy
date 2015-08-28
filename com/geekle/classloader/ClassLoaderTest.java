package com.geekle.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//String classPath = ClassLoaderTest.class.getClassLoader().getResource("").toString();
		PathClassLoader pathClassLoader = new PathClassLoader("");
		Class clz = pathClassLoader.findClass("A");
		Object o = clz.newInstance();
		Method method = clz.getMethod("foo", new String().getClass());
		Object result = method.invoke(o, new String("ll"));
		System.out.println(result);
	}
	
}
