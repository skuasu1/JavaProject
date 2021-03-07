package arrayInterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArraysExample {

	public static void main(String[] args) {

		ArrayList<String> lst1 = new ArrayList<String>(Arrays.asList("z", "a", "b", "c"));
		ArrayList<String> lst12 = new ArrayList<String>(Arrays.asList("x", "d", "e", "f"));
		
		lst1.addAll(lst12);
		Collections.sort(lst1);
		System.out.println("After sorting merged array is  : " +lst1);
		
	}
}
