package algorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 8, 7, 6 };
		BubbleSort obj = new BubbleSort();
		obj.bubblesort(arr);

		System.out.println("After sorting");
		obj.print(arr);

	}

	private void bubblesort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				while (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private void print(int[] arr) {

		int n = arr.length;
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
	}
}
