package practiseJavaCoding;

public class StringReversewitoutStringbuffer {

	public static void main(String[] args) {

		String s = "karthik";

		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
	}
}
