package com.geekle.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable {

//	@Override
//	public void run() {
//		try {
//			throw new RuntimeException("throw runtimeException!");//
//		} catch (Exception e) {
//			System.out.println("caught runtimeException");
//		}
//	}
	
	@Override
	public void run() {
		throw new RuntimeException("throw runtimeException!");//此exception不能被main主体捕获到
	}
	
	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
		} catch (Exception e) {
			System.out.println("main thread caught runtimeException");
		}

		System.out.println("exit ok ");
	}

}
