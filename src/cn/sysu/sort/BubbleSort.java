package cn.sysu.sort;

public class BubbleSort {
	
	
	public static int[] bubbleSort(int[] arr) {
		
		int length = arr.length;
		int temp = 0;
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		int[] bubbleSort = bubbleSort(arr);
		for (int i : bubbleSort) {			
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
