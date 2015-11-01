package com.geekle.threadException;


public abstract class PThread implements Runnable {

	@Override
	public void run() {//异常可在run方法内部处理，包括继承它的子类抛出的异常
		try {
			work();
		} catch (Exception e) {
			System.out.println("caught exception!!" + e.toString());
		}
		
		System.out.println("thread done!");
		
	}

	abstract void work();

}
