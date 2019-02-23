package cn.sysu.sort;

public class QuickSort {

	
	public static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int i = partition(arr, left, right);
			quickSort(arr, left, i-1);
			quickSort(arr, i+1, right);	
		}
			
	}
	private static int partition(int[] arr, int left, int right) {
		int base = arr[left];
		int i = left, j = right + 1;
		int temp = 0;
		while(true) {
			while(arr[++i] < base && i < right);
			while(arr[--j] > base);
			if(i >= j)
				break;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		arr[left] = arr[j];
		arr[j] = base;
		return j;
	}
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
