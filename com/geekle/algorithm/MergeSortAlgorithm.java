package com.geekle.algorithm;


public class MergeSortAlgorithm {
	
	
	
	/**
	 * 两个顺序数组进行合并排序
	 * 
	 * @param a 待排序的数组
	 * @param first 待排序的子数组开始的下标
	 * @param mid 待排序的子数组的中间的下标
	 * @param last 待排序的数组的结束下标
	 * @param tmp 临时排序数组
	 */
	public static void merge(int[] a, int first, int mid, int last, int[] tmp) {
		int i = first,j=mid +1 ,k = first;
		
		//依次比较两个数组的元素，将小的放入到tmp中
		while (i <= mid && j <= last) {
			if (a[i] < a[j]) {
				tmp[k++] = a[i++];
			} else if (a[i] > a[j]){
				tmp[k++] = a[j++];
				
			} else if (a[i] == a[j]) {
				tmp[k++] = a[i++];
				tmp[k++] = a[j++];
			}
		}
		
		//将两个数组中剩下的元素给tmp
		while (i <= mid) {
			tmp[k++] = a[i++];
		}
		while (j <= last) {
			tmp[k++] = a[j++];
		}
		
		//将排序号的tmp数组复制给待排序的数组a
		for (int m = first; m < last+1; m++) {
			a[m] = tmp[m];
		}
	}
	
	/**
	 * 将数组递归成两部分
	 * 
	 * @param a 待排序的数组
	 * @param first 待排序子数组的开始下标
	 * @param last 待排序子数组的结束下标
	 * @param tmp 临时的排序数组
	 */
	public static void mergeSort(int[] a, int first, int last,int[] tmp) {
		if (first == last) {
			return;
		}else {
			int mid = (last + first)/2;
			mergeSort(a, first, mid, tmp); //左边有序
			mergeSort(a, mid+1, last, tmp); //右边有序
			merge(a, first, mid, last, tmp); //将两个有序数组合并排序
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,5,7,6,2,1,4,5,3};
		int[] tmp = new int[a.length];
		long start = System.currentTimeMillis();
		mergeSort(a, 0, a.length-1,tmp);
		long finish = System.currentTimeMillis();
		System.err.println(finish-start);
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i]+ " ");
		}
	}
}
