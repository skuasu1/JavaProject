package practiseJavaCoding;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "abba";

		if (palindrome(s)) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}

	private static boolean palindrome(String s) {

		int i = 0, j = s.length() - 1;
		while (i < j) {

			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
