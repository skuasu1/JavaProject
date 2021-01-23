package OOP3;

public class Test extends Shape {

	public Test() {
		System.out.println("this is the default constructor class");
	}

	public static void main(String[] args) {
		Shape s = new Test();
		Test t = new Test();
		s.draw();
		s.fill();
	}

	@Override
	void draw() {
		System.out.println("this is the method inside the main class extends from abstract class");

	}

}
