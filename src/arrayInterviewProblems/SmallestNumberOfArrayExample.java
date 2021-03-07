package arrayInterviewProblems;

public class SmallestNumberOfArrayExample {

	public static void main(String[] args) {

		SmallestNumberOfArrayExample obj = new SmallestNumberOfArrayExample();

		int arr[] = { 10, 88, 77, 34, 21, 8, 0 };

		System.out.println(" Smallest element of the array is : " + obj.smallestNumberOfArrayElement(arr, arr.length));

	}

	private int smallestNumberOfArrayElement(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

}
