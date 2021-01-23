package LearningJavaCoding;

public class PrimNumber {

	public static void main(String[] args) {
		// number that is divisibile by 1 and itsef
		int n = 51,  count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("It is a prime");
		} else {
			System.out.println("it is not prime");
		}

	}

}
