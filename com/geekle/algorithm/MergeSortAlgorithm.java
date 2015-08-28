package com.geekle.algorithm;


public class MergeSortAlgorithm {
	public static void merge(int[] a, int first, int mid, int last, int[] tmp) {
		int i = first,j=mid +1 ,k = first;
		while (i <= mid && j <= last) {
			if (a[i] < a[j]) {
				tmp[k++] = a[i];
				i++;
			} else if (a[i] > a[j]){
				tmp[k++] = a[j];
				j++;
				
			} else if (a[i] == a[j]) {
				tmp[k++] = a[i];
				tmp[k++] = a[j];
				i++;
				j++;
			}
		}
		while (i <= mid) {
			tmp[k++] = a[i++];
		}
		while (j <= last) {
			tmp[k++] = a[j++];
		}
		
		for (int m = first; m < last+1; m++) {
			a[m] = tmp[m];
		}
	}
	
	public static void mergeSort(int[] a, int first, int last,int[] tmp) {
		if (first == last) {
			return;
		}else {
			int mid = (last + first)/2;
			mergeSort(a, first, mid, tmp);
			mergeSort(a, mid+1, last, tmp);
			merge(a, first, mid, last, tmp);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,5,7,6,2,1,4};
		int[] tmp = new int[a.length];
		mergeSort(a, 0, a.length-1,tmp);
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}
}
