package arrayInterviewProblems;

public class MoveAllNegativeOneEnd {

	public static void main(String[] args) {

		int arr[] = { -7, -6, 2, 3, -9, 0 };

		MoveAllNegativeOneEnd obj = new MoveAllNegativeOneEnd();
		obj.moveAllNegativeOneEnd(arr, arr.length);
		obj.printArray(arr, arr.length);

	}

	private void moveAllNegativeOneEnd(int[] arr, int n) {

		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}

	}

	public void printArray(int arr[], int n) {
		System.out.println("Array Elelemts after rearranging : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
