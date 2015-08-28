package com.geekle.test;

/*比较两个正整数的二进制有多少位不同*/
public class CompareNumbers {
	public static void main (String[] args) {
		int flag = 1;
		int count = 0;
		int m = 6;
		int n = 8;
		m = m^n;
		while (flag > 0) {
			if ((m & flag)>0) {
				count++;
			}
			flag = flag << 1;
		}
		System.out.println(count);
	}
}
