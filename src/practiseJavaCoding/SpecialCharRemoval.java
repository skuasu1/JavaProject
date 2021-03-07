package practiseJavaCoding;

import java.util.Scanner;

public class SpecialCharRemoval {

	public static void main(String[] args) {

		System.out.println("Enter the string that need to be removed from special characters :");
		Scanner sc = new Scanner(System.in);
		String oldValue = sc.nextLine();

		if (oldValue == " ") {
			System.out.println("Enter some valid input");
		} else {
			System.out.println("*******************");
			System.out.println("The resultant value " + "of the string after removing special character is : "
					+ oldValue.replaceAll("[^a-z,A-Z,0-9]", ""));
		}

	}

}
