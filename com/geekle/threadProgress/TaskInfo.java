package com.geekle.threadProgress;

public class TaskInfo {

	public static void main(String[] args) {
		TaskControl taskControl = new TaskControl();
//		for (int i = 0; i < 5; i++) {
//			taskControl.addTask(new Task());
//		}
//		
		TaskUpdater taskUpdater = new TaskUpdater();
		taskControl.execute(taskUpdater);
		while (taskControl.isTerminated()) {
			System.out.println(" executor has been shut down.");
		}		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (taskUpdater.getActiveCount()> 0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("complete tasks " + taskUpdater.getCompleteTaskCount());
			System.out.println("active tasks " + taskUpdater.getActiveCount());
			System.out.println("tatal tasks " + taskUpdater.getTaskCount());
		}
		while (taskControl.isShutdown()) {
			System.out.println(" executor has been shut down.");
		}
		if (taskControl.isTerminated()) {
			System.out.println("all tasks have completed following shut down.");
		}

	}

}
