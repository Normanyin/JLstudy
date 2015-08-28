package com.geekle.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PathClassLoader  extends ClassLoader{
	private String classPath;
	private String packageName = "com.geekle.classloader";
	
	public PathClassLoader(String classPath) {
		this.classPath = classPath;
	}
	
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		if (packageName.startsWith(name)) {
			byte[] classData = getData(name);
			if (classData == null) {
				throw new ClassNotFoundException();
			} else {
				return defineClass(name, classData, 0, classData.length);
			}
		} else {
			return super.loadClass(name);
		}
	}

	private byte[] getData(String className) {
		String path = classPath + File.separatorChar + className.replace('.', File.separatorChar) + ".class";
		try {
			InputStream is = new FileInputStream(path);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			byte[] buffer = new byte[2048];
			int num = 0;
			while ((num = is.read(buffer)) != -1) {
				stream.write(buffer, 0, num);
			}
			return stream.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
