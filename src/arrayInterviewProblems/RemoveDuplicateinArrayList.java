package arrayInterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateinArrayList {

	public static void main(String[] args) {

		ArrayList<String> Lst = new ArrayList<String>(Arrays.asList("C", "C", "Java"));
		LinkedHashSet<String> lt = new LinkedHashSet<String>(Lst);
		ArrayList<String> Lst2 = new ArrayList<String>(lt);
		System.out.println(Lst2);
	}
}
