package arrayInterviewProblems;

import java.util.Arrays;
import java.util.Collections;

public class MakingArrayElementsSame {

	public static void main(String[] args) {

		Integer arr[] = { 3, 6, 6 };
		int N = arr.length;
		System.out.print(solve(arr, N));
	}

	static int solve(Integer[] arr, int n) {

		// Sort arrays in descending order

		Arrays.sort(arr, Collections.reverseOrder());// 6,6,3

		// stores the minimum array of elements

		int minimum = arr[n - 1];
		int count1 = 0, count2 = 0, count3 = 0;

		// Stores the operations required
		// to make array elements equal
		// to minimum

		count1 = calculate_steps(arr, n, minimum);

		// Stores the operations required
		// to make array elements equal to
		// minimum - 1
		count2 = calculate_steps(arr, n, minimum - 1);

		count3 = calculate_steps(arr, n, minimum - 2);

		// Return minimum of the three counts
		return Math.min(count1, Math.min(count2, count3));

	}

	public static int calculate_steps(Integer[] arr, int n, int minimum) {

		int count = 0;

		for (int i = 0; i < n; i++) {
			int val = arr[i];

			if (arr[i] > minimum) {

				// Finds how much extra amount
				// is to be removed
				arr[i] = arr[i] - minimum;

				// Subtract the maximum number
				// of 5 and stores remaining
				count += arr[i] / 5;

				arr[i] = arr[i] % 5;

				// Subtract the maximum number
				// of 2 and stores remaining
				count += arr[i] / 2;

				arr[i] = arr[i] % 2;

				if (arr[i] > 0) {
					count++;
				}
			}

			// Restores the actual value
			// of arr[i]
			arr[i] = val;
		}
		return count;
	}
}
