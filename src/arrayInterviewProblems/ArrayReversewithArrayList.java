package arrayInterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayReversewithArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4));
		System.out.println(" original Array is :" + a);
		Collections.sort(a);
		System.out.println(" Reveresed Array is :" + a);

	}

}
