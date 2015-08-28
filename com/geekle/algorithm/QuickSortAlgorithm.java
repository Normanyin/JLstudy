package com.geekle.algorithm;


public class QuickSortAlgorithm {

	/**
	 * 快排
	 * @param a 待排序数组
	 * @param first 排序区间开始的下标
	 * @param last 排序区间结束的下标
	 */
	public static void quick(int[] a, int first, int last) {
		if (first < last) {	
		
			int x = a[first];//每次排序时的基准值
			
			int i = first;//左游标
			int j = last;//右游标
			while (i < j) { //当两游标没有重叠时执行
				while (i < j && a[j] > x) { //每次排序都先右再左进行,只要右边小于或者等于基准值，就将该值移到左边
					j--;
				}
				if (i < j) { //执行到这一步，即右边小于或者等于基准值
					a[i++] = a[j];
				}
				
				while (i < j && a[i] < x) { //只要左边值大于或者等于基准值，就将该值移到右边
					i++;
				}
				if (i < j) { //执行到这一步，即左大于或者等于基准值
					a[j--] = a[i];
				}
			}
			a[i] = x;//将基准值赋值到当前坐标，这里是i,j相遇的地方，及该值左边都小于该值，右边都大于该值
			quick(a, first, i - 1);
			quick(a, i + 1, last);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = {3,5,7,6,2,1,4};
		long start = System.currentTimeMillis();
		quick(a, 0, a.length-1);
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
