package LearningJavaCoding;

public class NumberPalindrome {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0, temp;
		temp = n;
		while (n != 0) {
			int remainder = n % 10;
			n = n / 10;
			sum = (sum * 10) + remainder;
			System.out.println(sum);
		}
		if (temp == sum) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
