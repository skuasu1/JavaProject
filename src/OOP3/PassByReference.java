package OOP3;

public class PassByReference {

	// class level variable
	int number;
	// to do pass by reference create default constructor

	public PassByReference() {
		number = 1;

	}

	public static void main(String[] args) {
		PassByReference obj = new PassByReference();
		update(obj);
		System.out.println(obj.number);
	}

	public static void update(PassByReference obj) {
		obj.number++;
		
	}

}
