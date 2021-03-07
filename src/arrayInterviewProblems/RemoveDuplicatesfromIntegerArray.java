package arrayInterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromIntegerArray {
	
	/*
	 * Using collections removing the duplicate elements of an arraylist
	 */

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 9, 9, 8, 7, 6, 6, 5));
		System.out.println(list);
		ArrayList<Integer> newlist = removeDuplicates(list);
		System.out.println(newlist);

	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
		
		ArrayList<Integer> newlist = new ArrayList<Integer>();

		// Traverse through the first list
		for (Integer element : list) {

			// If this element is not present in newList
			// then add it
			if (!newlist.contains(element)) {
				newlist.add(element);
			}
		}
		return newlist;
	}
}
