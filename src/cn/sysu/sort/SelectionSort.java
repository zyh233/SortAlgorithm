package cn.sysu.sort;

public class SelectionSort {
	public static int[] selectSort(int[] arr) {
		int length = arr.length;
		int min = Integer.MAX_VALUE;//可以省略，每次用arr[i]为最小元素
		int ids = 0, temp = 0;
		for(int i = 0; i < length - 1; i++) {
			min = Integer.MAX_VALUE;
			for(int j = i; j < length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					ids = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[ids];
			arr[ids] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		int[] selectSort = selectSort(arr);
		for (int i : selectSort) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
