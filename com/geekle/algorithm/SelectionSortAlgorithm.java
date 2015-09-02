package com.geekle.algorithm;

public class SelectionSortAlgorithm {
	
	/**
	 * 选择排序法，将数组无序数组分为前后有序无序两个部分，每次内循环将最小数调出来放在有序数组后面，内循环起始数＋1
	 * @param a
	 */
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;// 保存最小数的坐标，先假定i为最小数
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[min]) { //当前数小于最小数，则min保存该坐标
					min = j;
				}
			}
			int tmp = a[i];//将最小数和i进行交换
			a[i] = a[min];
			a[min] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] a = {1,4,5,3,9,2};
		selectionSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
