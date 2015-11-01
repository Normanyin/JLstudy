package com.geekle.threadProgress;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TaskControl extends ThreadPoolExecutor {

	/**
	 * 最大可以同时工作的任务数
	 */
	private static final int MAX_TASK_NUMBER = 2; 
	
	public TaskControl() {
		super(MAX_TASK_NUMBER, Integer.MAX_VALUE, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
		// TODO Auto-generated constructor stub
	}
	
	public void addTask(Task task) {
		execute(task);
	}

}
