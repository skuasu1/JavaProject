package OOP3;

import javaTraining.Encapsulation;

public class EncapsulationImplementation extends Encapsulation {

	public static void main(String[] args) {
		EncapsulationImplementation obj = new EncapsulationImplementation();
		obj.setAge(20);
		obj.setId(01);
		obj.setName("karthikSubramanaya");

		System.out.println(obj.getAge());
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}
