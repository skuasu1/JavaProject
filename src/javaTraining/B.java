package javaTraining;

public class B extends A{
	
	public B() {
		// super keyword is used to call parent class constructor if not written then default constructor is called
		super(10);
		System.out.println("this is default constructor of class b");
	}

	public static void main(String[] args) {
		B obj = new B();

	}

}
