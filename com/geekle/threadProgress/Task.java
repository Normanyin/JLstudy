package com.geekle.threadProgress;

public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(this + "start");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this + "finished");
	}

}
