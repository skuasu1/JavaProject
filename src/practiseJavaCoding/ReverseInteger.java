package practiseJavaCoding;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		int remainder;
		int result = 0;

		System.out.println("Enter the integer that needs to be reversed : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			result = result * 10 + remainder;
		}
		System.out.println("Reverse of the integer is : " + result);
	}

}
