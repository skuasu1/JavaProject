package LearningJavaCoding;

public class StringPalindrome {

	public static void main(String[] args) {

		// example for string palindroms : abba

		String s = "Geeks";
		if (palindrome(s)) {

			System.out.println(s + " is a Palindrome");

		} else {
			System.out.println(s + " is not a  Palindrome");
		}
	}

	private static boolean palindrome(String s) {

		// i =0 and j will tbe last index
		int i = 0, j = s.length() - 1;
		while (i < j) {
			// chaAt will take the value mentioned in that index

			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
