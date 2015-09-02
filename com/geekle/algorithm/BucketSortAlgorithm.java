package com.geekle.algorithm;

public class BucketSortAlgorithm {
	
	/**
	 * 桶排序
	 * @param a
	 * @return 填充好的桶
	 */
	public static int[] bucketSort(int[] a) {
		int max = a[0];//保存需要初始化桶的个数
		for (int i = 0; i < a.length; i++) {//根据数组的值，记录最大的桶个数
			if (a[i] > max) {
				max = a[i];
			}
		}
		int[] b = new int[max + 1];//初始化max+1个桶
		for (int i = 0; i < a.length; i++) {//将编号为a[i]的桶+1，重复的数据在同一个桶+1
			b[a[i]]++;
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = {2,5,1,5,7,9,12};
		int[] b = bucketSort(a);
		for (int i = 0; i < b.length; i++) {
			while (b[i]-- > 0) {//将不为零的桶的编号打印出来，重复的元素指导桶内的数自减为零
				System.out.print(i + " ");
			}
		}
	}

}
