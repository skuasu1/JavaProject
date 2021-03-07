package OOP3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter the string u need to reverse : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] c = str.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			
			
			System.out.println(c[i]);

		}

	}
}
