package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

// delcaring
		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9));
		System.out.println(arr1);

		// retain collections

		arr1.retainAll(Collections.singleton(8));
		System.out.println(arr1);
		arr1.set(1, 99);
		System.out.println(arr1);

		ArrayList<String> arrListString = new ArrayList<String>(
				Arrays.asList("Java", "python", "C", "Ruby", "Java-Script"));
		System.out.println(arrListString);

		// to get the sublist need to have another list of the List generic type
		List<String> subList2 = arrListString.subList(1, 4);
		System.out.println(subList2);

		// conversion of Array list to array
		Object[] skuasu = subList2.toArray();

		for (Object skuasu1 : subList2) {
			System.out.println(skuasu1);
		}

		/*
		 * clone add all , add specific index add object remove remove allremove ob
		 * contains
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		/*
		 * ArrayList<String> arr2 = new
		 * ArrayList<String>(Arrays.asList("Ram","Sham","Cat"));
		 * System.out.println(arr2);
		 * 
		 * ArrayList<String> arr3 = new
		 * ArrayList<String>(Arrays.asList("dog","bull","Cat"));
		 * 
		 * arr2.addAll(arr3); arr2.add(2, "skuasu");
		 * 
		 * System.out.println(arr2);
		 */

	}

}
