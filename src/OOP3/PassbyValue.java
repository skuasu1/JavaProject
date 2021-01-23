package OOP3;

public class PassbyValue {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		PassbyValue p = new PassbyValue();
		p.add(a, b);
		System.out.println(p);

	}

	public int add(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);
		return c;
	}
	

}
