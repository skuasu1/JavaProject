package OOP3;

public abstract class Shape {
	int color;
	

// cannot create object of abstract class and interface
	abstract void draw();
	public void fill() {
		System.out.println("non abstract");
	}

}
