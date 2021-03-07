package arrayInterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateinArrayListMethod2 {

	public static void main(String[] args) {
		// using Stream

		ArrayList<String> Lst = new ArrayList<String>(Arrays.asList("C", "C", "Java"));
		List<String> Lt = Lst.stream().distinct().collect(Collectors.toList());
		System.out.println(Lt);
	}
}
