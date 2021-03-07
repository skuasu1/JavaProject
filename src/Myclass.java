import java.util.Scanner;

class Solution {
	public void printOddEven(int[] nums) {
		char[] chArr = new char[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				chArr[i] = 'e';

			} else {
				chArr[i] = 'o';
			}
		}
		
		String str = String.valueOf(chArr);
		String sample = str.replace("", " ").trim();
		System.out.println(sample);
	}

}

public class Myclass {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner myObj = new Scanner(System.in); // a Scanner object
		String line = myObj.nextLine(); // Read user input
		int[] nums = takeInput(line.trim());
		new Solution().printOddEven(nums);// print output
		myObj.close();
	}

	private static int[] takeInput(String input) {
		if (input.length() == 0) {
			return new int[0];
		}
		String[] parts = input.split(" ");
		int[] output = new int[parts.length];
		for (int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;
	}

}