package OOP3;

public class PassbyValue {
// class level or instancevariable
	public static void main(String[] args) {
		// local variable
		int x = 10;
		int y = 20;
		add(x, y);
		System.out.println(add(x, y));
	}
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
}
