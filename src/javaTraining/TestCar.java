package javaTraining;

public class TestCar {

	public static void main(String[] args) {

		/*
		 * // when same method contained in parent an child calss with same name andsame
		 * // number // of arguments called as the method overriding
		 */
		BMW b = new BMW();
		b.start();// check the childclass then the extended parent class since samemethod
					// preference is given tochild class
		b.tyre();
		b.safety();

		InheritanceCar c = new InheritanceCar();
		c.start();
		c.tyre();
		c.engine();

		InheritanceCar c1 = new BMW(); // child object refered from parent class// dynamic polymorphism
		c1.tyre();
		c1.color();

	}

}
