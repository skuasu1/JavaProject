package practiseJavaCoding;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		int actualInteger;
		int reverseInteger = 0;

		System.out.println("Enter the number to check Palindrome : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		actualInteger = number;
		while (number != 0) {
			int remainder = number % 10;
			number = number / 10;
			reverseInteger = reverseInteger * 10 + remainder;

		}
		if (actualInteger == reverseInteger) {
			System.out.println(actualInteger + " is a Palindrome");
		} else {
			System.out.println(actualInteger + " is not a Palindrome");
		}

	}
}
