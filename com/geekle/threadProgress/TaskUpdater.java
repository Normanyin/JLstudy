package com.geekle.threadProgress;



public class TaskUpdater implements Runnable {

	TaskControl taskControl = new TaskControl();
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			taskControl.addTask(new Task());
		}
	}
	
	public int getActiveCount() {
		return taskControl.getActiveCount();
		
	}
	
	public long getCompleteTaskCount() {
		return taskControl.getCompletedTaskCount();
	}
	
	public long getTaskCount() {
		return taskControl.getTaskCount();
	}

}
