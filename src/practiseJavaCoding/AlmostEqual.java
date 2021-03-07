package practiseJavaCoding;

import org.apache.commons.lang3.StringUtils;

public class AlmostEqual {

	public static void main(String[] args) {

		String s1 = "suryansh";
		String s2 = "suryanshzzawesome";

		String diff = StringUtils.difference(s1, s2);
		System.out.println(diff.length());

	}

}
