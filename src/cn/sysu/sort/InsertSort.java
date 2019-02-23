package cn.sysu.sort;

public class InsertSort {

	
	public static int[] insertSort(int[] arr) {
		int length = arr.length;
		int temp = 0, ids;
		for(int i = 1; i < length; i++) {
			temp = arr[i];
			ids = i - 1;
			while (ids >= 0 && temp < arr[ids] ) {
				arr[ids + 1] = arr[ids];
				ids--;
				
			}
			arr[ids + 1] = temp;
			
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		int[] insertSort = insertSort(arr);
		for (int i : insertSort) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
