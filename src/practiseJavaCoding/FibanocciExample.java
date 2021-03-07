package practiseJavaCoding;

import java.util.Scanner;

public class FibanocciExample {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		System.out.println("Enter the count for the fibanocci : ");

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		if (count > 0) {
			System.out.println(n1);
			System.out.println(n2);
		}
		for (int i = 2; i < count; i++) {
			int fibResult = n1 + n2;
			n1 = n2;
			n2 = fibResult;
			System.out.println(fibResult);
		}

	}

}
