package javaTraining;

public class ConstructorClass {
	// classvariables
	String name;
	int age;

	// this is an constructor class 0 parameterconstructor
	public ConstructorClass() {
		System.out.println("this is default constructor");
	}
	// 1 paramconstructor
	public ConstructorClass(int i) {
		System.out.println("this is 1 para constructor" +i);
	}
// 2 param constructor
	public ConstructorClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorClass obj = new ConstructorClass();
		ConstructorClass obj1 = new ConstructorClass(10);
		ConstructorClass obj2 = new ConstructorClass("Ram",30);
		
		System.out.println(obj2.name);
		System.out.println(obj2.age);

	}

}
