package com.geekle.algorithm;

/**
 * @author geekle
 *	直接插入排序
 */
public class DirectInsertSortAlgorithm {
	public static void directInsert(int[] a) {
		for (int i = 0; i < a.length; i++) {//每次取有序区间后的一个数与有序数组进行比较
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j]) {
					continue;
				} else {
					insert(a,i,j);//将新元素插入到有序数组中
				}
			}
		}
	}
	private static void insert(int[] a, int i, int j) {
		int tmp = a[i];
		for (int j2 = i; j2 > j; j2--) {//有序区间整体后移
			a[j2] = a[j2 - 1];
		}
		a[j] = tmp;
	}
	public static void main(String[] args) {
		int[] a = {9,8,5,3,2,6};
		directInsert(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
