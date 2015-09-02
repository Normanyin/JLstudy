package com.geekle.algorithm;

import java.util.Arrays;

public class HeapSortAlgorithm {
	int[] a;
	int heapsize;
	
	public HeapSortAlgorithm (int[] a) {
		this.a = a;
		this.heapsize = a.length;
	}
	
	public void deleteMin(int[] a) {
		
	}
	
	/**
	 * 通过将最小值提取出来放到数组最末尾，再将数组size减一
	 */
	public void heapSort() {
		int tmp = a[heapsize - 1];
		if (heapsize == 1) {
			return;
		}
		a[heapsize - 1] = a[0];
		a[0] = tmp;
		heapsize--;
		buildHeap();
		
		heapSort();
	}
	
	/**
	 *创建一个堆
	 */
	public void buildHeap() {
		for (int i = heapsize/2 - 1; i >= 0; i--) {
			downFilter(i);
		}
	}
	/**
	 * 下标i的下滤操作，通过与左右叶子节点的比较调整为最小堆
	 * @param i 
	 */
	private void downFilter(int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int min = i;//假设最小节点是当前节点，下面比较当前节点与子节点
		
		if (l < heapsize && a[i] > a[l]) {//当前节点i大于左子节点，则最小值节点是左子节点，否则当前节点是最小节点
			min = l;
		} else {
			min = i;
		}
		
		if (r < heapsize && a[min] > a[r]) {//当前最小节点（min）大于右边节点，则右子节点是最小节点，否则是当前节点是最小节点
			min = r;
		}
		if (min == i) {//如果当前节点满足最小二叉堆的堆序性，则返回去判断其他节点
			return;
		}

		int tmp = a[i];
		a[i] = a[min];
		a[min] = tmp;
		downFilter(min);
	}
	public static void main(String[] args) {
		int[] array = {5,7,4,2};
		HeapSortAlgorithm t = new HeapSortAlgorithm(array);
		t.buildHeap();
		t.heapSort();
		Arrays.sort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
