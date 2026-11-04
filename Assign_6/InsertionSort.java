package assignments;

import java.util.Arrays;

public class InsertionSort {
	
	public static void insertionSortDescending(int[] arr, int length) {
	    for (int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int j = i - 1;
	        while (j >= 0 && key > arr[j]) {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key;
	    }
	}

	public static void main(String[] args) {

		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSortDescending(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
