package arrayInterviewProblems;

public class LargestNumberofArrayElements {

	public static void main(String[] args) {

		LargestNumberofArrayElements obj = new LargestNumberofArrayElements();

		int arr[] = { 10, 88, 77, 34, 21, 8, 0, 100 };

		System.out.println(" Largest element of the array is : " + obj.largestNumberofArrayElement(arr, arr.length));

	}

	private int largestNumberofArrayElement(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

}
