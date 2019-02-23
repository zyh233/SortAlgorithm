package cn.sysu.sort;

public class HeapSort {

	
	public static void heapSort(int[] arr) {
		int length = arr.length;
		for(int i = length / 2 - 1; i >= 0; i--) {
			heapAdjust(arr, i, length);
		}
		for(int i = length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapAdjust(arr, 0, i);
		}
	}
	/**
	 * 
	 * @param arr 堆
	 * @param i 调整下标为i的节点
	 * @param length 堆的长度
	 */
	public static void heapAdjust(int[] arr, int i, int length) {
		int max = i;
		int lchild = i * 2 + 1;
		int rchild = i * 2 + 2;
		if(lchild < length && arr[lchild] > arr[max]) {
			max = lchild;
		}
		
		if(rchild < length && arr[rchild] > arr[max]) {
			max = rchild;
		}
		
		if(i != max) {
			
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			heapAdjust(arr, max, length);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		heapSort(arr);
		for (int i : arr) {
			
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
