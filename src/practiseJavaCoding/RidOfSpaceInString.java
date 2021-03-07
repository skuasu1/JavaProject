package practiseJavaCoding;

public class RidOfSpaceInString {

	public static void main(String[] args) {

		RidOfSpaceInString o = new RidOfSpaceInString();
		o.ridofspaceInString(" Try    to    remove   extra   spaces. ");

	}

	private void ridofspaceInString(String string) {

		System.out.println("Given string is :" + string);
		System.out.println("String after removalof space is : " +string.replaceAll("\\s+", " "));
	}

}
