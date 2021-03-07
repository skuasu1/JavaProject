package arrayInterviewProblems;

import java.util.Arrays;

public class FindMissingNumberArraySingleElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("The missing number is " + getMissingNumber(arr));

	}

	private static int getMissingNumber(int[] arr) {

		int n = arr.length;
		// to get total sum
		int total = (n + 1) * (n + 2) / 2;
		// sum of all elements in array
		int sum = Arrays.stream(arr).sum();

		return total - sum;
	}

}
