package practiseJavaCoding;

public class StringOccurrance {

	public static void main(String[] args) {
		String str = "Geeks for Geeks A computer science portal for geeks";
		String word = "Geeks";
		System.out.println(wordOccurrance(str, word));

	}

	private static int wordOccurrance(String str, String word) {

		String a[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equalsIgnoreCase(a[i])) {
				count++;
			}
		}
		return count;
	}

}
