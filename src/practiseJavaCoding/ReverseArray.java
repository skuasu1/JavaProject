package practiseJavaCoding;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		reverseArray(arr, arr.length);

	}

	private static void reverseArray(int[] arr, int n) {

		System.out.println("Original Array is : " + Arrays.toString(arr));
		int temp;
		for (int i = 0; i < n / 2; i++) {

			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
		System.out.println("After of array is : " + Arrays.toString(arr));

	}
}
