package com.geekle.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalTime {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Date startDate = new Date();
		int d = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
//				try {
////					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
		long endTime = System.currentTimeMillis();
		Date endDate = new Date();
		long result = endTime - startTime;
		
		System.out.println(getDatetimeString());
	}
	
	public static String getDatetimeString() {
		SimpleDateFormat sFormat = new SimpleDateFormat("YYYY/M/d HH:mm:ss");
		Date date = new Date();
		return sFormat.format(date);
	}
}
