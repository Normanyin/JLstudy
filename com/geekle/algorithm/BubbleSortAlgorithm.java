package com.geekle.algorithm;

public class BubbleSortAlgorithm {

	/**
	 * 冒泡将最大的数字交换到数组后面去
	 * @param a
	 */
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {//两个相邻的数进行排序，大的往后交换，冒泡完后下一轮少一个数字
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {2,6,4,8,7,1};
		bubbleSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
