package practiseJavaCoding;

public class NewStringPalindrome {

	public static void main(String[] args) {
		String s = "abba";

		if (Palindrome(s)) {
			System.out.println("String  is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

	private static boolean Palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
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
