package com.geekle.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/*
 * 运行结果说明
 * ExceptionThread2，主线程执行打印下面信息
	created Thread[Thread-0,5,main]
	eh = com.geekle.thread.MyUncaughtExceptionHandler@fce56f8
	run() by Thread[Thread-0,5,main]
	eh = com.geekle.thread.MyUncaughtExceptionHandler@fce56f8
 * ExceptionThread2主体执行完，然后抛RuntimeException异常
	
	通过该方法给某个thread设置一个UncaughtExceptionHandler，可以确保在该线程出现异常时能通过回调
	UncaughtExceptionHandler接口的public void uncaughtException(Thread t, Throwable e) 方法来处理异常，
	这样的好处或者说目的是可以在线程代码边界之外（Thread的run()方法之外），有一个地方能处理未捕获异常。
	但是要特别明确的是：虽然是在回调方法中处理异常，但这个回调方法在执行时依然还在抛出异常的这个线程中！
	另外还要特别说明一点：如果线程是通过线程池创建，线程异常发生时UncaughtExceptionHandler接口不一定会立即回调
	com.geekle.thread.HandlerThreadFactory@1bd11b79creating new Thread  
 * 这里又产生了一个特殊的新线程，来执行捕获的过程
	created Thread[Thread-1,5,main]
	eh = com.geekle.thread.MyUncaughtExceptionHandler@7885bf5f
	caught Thread[Thread-0,5,main]
 */


class ExceptionThread2 implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run() by " + t);
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught " + t);
	}
}

class HandlerThreadFactory implements ThreadFactory {
	public Thread newThread(Runnable r) {
		System.out.println(this + "creating new Thread");
		Thread t = new Thread(r);
		System.out.println("created " + t);
		t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println("eh = " + t.getUncaughtExceptionHandler());
		return t;
	}
}

/**
 * @author yingao
 *
 */
/**
 * @author yingao
 *
 */
public class CaptureUncaughtException  {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());
		exec.execute(new ExceptionThread2());	
	}
}

