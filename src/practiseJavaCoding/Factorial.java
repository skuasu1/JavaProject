package practiseJavaCoding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial = 1;
		System.out.println(" Enter the number to check or the factorial :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a number is : " + factorial);
		
	}

}
