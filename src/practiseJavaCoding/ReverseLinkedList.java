package practiseJavaCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// using collections
		LinkedList<Integer> lst = new LinkedList<Integer>(Arrays.asList(5, 4, 3, 2, 1));
		Collections.sort(lst);
		System.out.println(lst);
	}

}
