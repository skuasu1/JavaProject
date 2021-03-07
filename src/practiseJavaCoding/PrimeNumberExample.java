package practiseJavaCoding;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {

		PrimeNumberExample obj = new PrimeNumberExample();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check it is prime or not : ");
		int n = s.nextInt();
		obj.primeNumber(n);

	}

	private void primeNumber(int n) {

		System.out.println("Entered Number is " + n);
		while (n != 0) {
			if (n % 2 == 0) {
				System.out.println(n + " : Is not a prime number");
				break;
			} else {
				System.out.println(n + " : Is a prime number");
				break;
			}
		}

	}

}
