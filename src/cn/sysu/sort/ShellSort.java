package cn.sysu.sort;

public class ShellSort {

	public static void shellSort(int[] arr) {
		int length = arr.length;
		int step = length;
		int i, j, k, temp;
		
		do {
			step = step / 3 + 1;
			for(i = 0; i < step; i++) {
				for(j = i + step; j < length; j += step) {
					if(arr[j] < arr[j - step]) {
						temp = arr[j];
						for(k = j - step; k >= 0 && temp < arr[k]; k -= step) {
							arr[k + step] = arr[k];
						}
						arr[k + step] = temp;
					}
				}
			}
		} while (step > 1);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {12,4,45,86,43,7,54,23,15,20};
		shellSort(arr);
		for (int i : arr) {
			
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
