package leetCodeProblems;

public class RotatingArrayByKItems {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 3;

		leftRotate(arr, d); // Rotate array by d
		printArray(arr);

	}

	static void leftRotate(int arr[], int d) {

		if (d == 0)
			return;

		int n = arr.length;
		// in case the rotating factor is
		// greater than array length
		d = d % n;
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
	}

	static void printArray(int nums[]) {
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
	}

	/* Function to reverse arr[] from index start to end */
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
