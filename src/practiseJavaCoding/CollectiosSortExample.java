package practiseJavaCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectiosSortExample {

	public static void main(String[] args) {

		ArrayList<String> aStr = new ArrayList<String>(
				Arrays.asList("Geeks For Geeks", "Friends", "Dear", "Is", "Superb"));

		Collections.sort(aStr);
		System.out.println("Sorted List is :" + aStr);
		System.out.println("LastString Length : " + aStr.get(4).length());

	}

}
