package LearningJavaCoding;

public class FibonnociNumber {

	public static void main(String[] args) {
		int n = 10;
		int n1 = 0, n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <= n; i++) {
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}
}
