package practiseJavaCoding;

public class LockersProblem {

	public static void main(String[] args) {

		closedLockers(10, 2);
		closedLockers(12, 3);// n= 10,m=2; open lockers 2,4,6,8,10

	}

	public static int closedLockers(int n, int m) {
		int even_count = 0, odd_count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % m == 0) {
				even_count++;
			}
			if (i % m != 0) {
				odd_count++;
			}
		}

		System.out.println (odd_count);
		return odd_count;

	}

}
