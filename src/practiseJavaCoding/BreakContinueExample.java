package practiseJavaCoding;

public class BreakContinueExample {

	public static void main(String[] args) {

		System.out.println("Continue Statement in Java");
		for (int i = 0; i < 10; i++) {
			if (i == 3)
				continue;
			System.out.println(i);
		}
		System.out.println("Out of loop");
		System.out.println("*************************************");
		
		System.out.println("Break Statement in Java");
		for (int i = 0; i < 10; i++) {
			if (i == 3)
				break;
			System.out.println(i);
		}
		System.out.println("Out of loop");
	}

}
