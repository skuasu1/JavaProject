package practiseJavaCoding;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n, originalInt;
		int reverseInt = 0;

		System.out.println("Enter the palindorme : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		originalInt = number;
		while (number != 0) {
			int remainder = number % 10;
			number = number / 10;
			reverseInt = reverseInt * 10 + remainder;
		}
		if (originalInt == reverseInt) {
			System.out.println(originalInt + " is a Palindrome");
		} else {
			System.out.println(originalInt + " is not a Palindrome");
		}
	}
}
