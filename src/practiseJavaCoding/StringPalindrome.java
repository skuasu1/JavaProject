package practiseJavaCoding;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		System.out.println("Enter the string to check for Palindrome : ");
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		if (value == null) {
			System.out.println("Enter the valid string");
		}
		if (Palindrome(value)) {
			System.out.println(value + " is a Palindrome");
		} else {
			System.out.println(value + " is not a Palindrome");
		}

	}

	private static boolean Palindrome(String value) {

		int i = 0, j = value.length() - 1;
		while (i < j) {
			if (value.charAt(i) != value.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
