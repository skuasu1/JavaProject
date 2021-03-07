package practiseJavaCoding;

public class SwappingTwoString {

	public static void main(String[] args) {

		SwappingTwoString obj = new SwappingTwoString();
		obj.swapString("Hello", "World");

	}

	private void swapString(String a, String b) {

		System.out.println("bfore Swap : " + "First word : " + a + " Second Word :" + b);
		// conncat 2 strings
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("bfore Swap : " + "First word : " + a + " Second Word :" + b);
	}
}
