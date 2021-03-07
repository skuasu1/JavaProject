public class GFG {

	public static void main(String[] args) {
		checkString("aaaaaa");
	}

	static void checkString(String s) {
		int v = 0;
		int c = 0;

		char[] strArray = s.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				stringBuffer.append(strArray[i]);
			}
		}
		for (int i = 0; i < stringBuffer.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				v++;
			} else {
				c++;
			}
		}

		if (v > c)
			System.out.print("Yes");
		else if (c > v)
			System.out.print("No");
		else
			System.out.print("Same");

		System.out.println();
	}
}
