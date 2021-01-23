package LearningJavaCoding;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// to get the armstrong number logic is 371 = 3 pow 3+ 7 pow3+1pow3
		int n = 371;
		int temp = n;
		double sum = 0;

		while (n != 0) {
			int remainder = n % 10;
			n = n / 10;
			sum = sum+Math.pow(remainder, 3);
		}
		System.out.println(sum);
	}

}
