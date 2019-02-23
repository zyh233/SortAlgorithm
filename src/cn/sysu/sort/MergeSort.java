package cn.sysu.sort;

public class MergeSort {
	
	public static void mergeSort(int arr[], int left, int right) {
		if(left < right) {			
			int i = (left + right) / 2;			
			mergeSort(arr, left, i);
			mergeSort(arr, i+1, right);			
			merge(arr, left, i, right);
		}
	}

	public static void merge(int[] arr, int left, int i, int right) {
		int len = right - left + 1;
		int[] b = new int[len];
		int j = left, k = i + 1, count = 0;
		while(j <= i && k <= right) {
			if(arr[j] < arr[k]) {
				b[count++] = arr[j];
				j++;
			} else {
				b[count++] = arr[k];
				k++;
			}
		}
		
		while(j <= i) {
			b[count++] = arr[j];
			j++;
		}
		
		while(k <= right) {
			b[count++] = arr[k];
			k++;
		}
		
		for(int t = 0; t < len; t++) {
			arr[left + t] = b[t];
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		mergeSort(arr, 0, arr.length -1);
		for (int i : arr) {
			
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
