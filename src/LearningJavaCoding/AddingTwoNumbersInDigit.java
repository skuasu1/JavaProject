package LearningJavaCoding;

public class AddingTwoNumbersInDigit {

	public static void main(String[] args) {
		int n = 455;
		int sum = 0;
		while (n != 0) {
			int remainder = n % 10;
			n = n / 10;
			sum += remainder;
		}
		System.out.println(sum);

	}

}
