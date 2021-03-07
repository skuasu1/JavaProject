package LearningJavaCoding;

import java.util.Scanner;

public class AddingTwoNumbersInDigit {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter the number where we need to add the digits : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int remainder = n % 10;
			n = n / 10;
			sum += remainder;
		}

		System.out.println("\n");
		System.out.println("Sum of digits of the number entered : " + sum);
	}

}
