package practiseJavaCoding;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 51;
		ReverseNumber obj = new ReverseNumber();
		obj.reverseNumber(n);
	}

	private void reverseNumber(int n) {
		System.out.println("Given Number is :" + n);
		int result = 0;
		while (n != 0) {
			int remainder = n % 10;
			n = n / 10;
			result = (result * 10) + remainder;
		}
		System.out.println("Reverse of given number is : " + result);
	}

}
