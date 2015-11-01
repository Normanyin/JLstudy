package com.geekle.threadException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExceptionTest {
	public static void main(String[] args) {
		ExecutorService exex = Executors.newCachedThreadPool();
		exex.execute(new SubThread());
		System.out.println("exit ok ");
	}
}
