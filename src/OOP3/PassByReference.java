package OOP3;

public class PassByReference {
	// this is a class level variale
	public int number;
// default constructor
	public PassByReference() {
		number = 1;
	}

	public static void main(String[] args) {
		PassByReference obj = new PassByReference();
		// before increment;
		System.out.println(obj.number);
		update(obj);
		System.out.println(obj.number);
	}

	private static void update(PassByReference obj) {
		obj.number++;
	}

}
