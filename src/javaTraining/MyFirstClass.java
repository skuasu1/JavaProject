package javaTraining;

// this is the abstract class and object cann ot be instantiated

public class MyFirstClass {
	
	public void display() {
		System.out.println("Hi there");
	}

	public static void main(String[] args) {

		MyFirstClass obj = new MyFirstClass();
		obj.display();

	}

}
