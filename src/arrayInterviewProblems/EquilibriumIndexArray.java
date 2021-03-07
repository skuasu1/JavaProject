package arrayInterviewProblems;

public class EquilibriumIndexArray {

	int sum = 0, leftsum = 0;

	int equilibrium(int c[], int n) {

		/* Find sum of the whole array */
		for (int i = 0; i < n; i++)
			sum += c[i];
		for (int i = 0; i < n; i++) {
			sum -= c[i];// sum is now right sum for index i
			if (leftsum == sum)
				return i;
			leftsum += c[i];

		}
		/* If no equilibrium index found, then return 0 */
		return -1;
	}

	public static void main(String[] args) {

		EquilibriumIndexArray obj = new EquilibriumIndexArray();
		int c[] = { 1, 2, 1,3 };
		System.out.println(obj.equilibrium(c, c.length));
	}
}
