package leetCodeProblems;

public class ReturnIndicesArray {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target
	 */

	public static void main(String[] args) {

		int[] arr = { 2, 7, 5, 6 };
		int target = 9;
		returnIndicesArray(arr, target);
		
	}

	private static int[] returnIndicesArray(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == target - arr[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
