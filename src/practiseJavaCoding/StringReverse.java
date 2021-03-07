package practiseJavaCoding;

public class StringReverse {
	public static void main(String[] args) {
		int count = 10;
		System.out.println("*****************");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= count; i++) {
			if (i % 2 == 0) {
				sb.append("e");
			} else {
				sb.append("o");
			}
		}
		String intnew = sb.toString();
		System.out.println(intnew);
	}
}
