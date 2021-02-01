package OOP3;

// extending from parent class and this is inheritance
// to preventinheritance and prevennt overriding we use final keyword to class
// final keyword is used to declare the constant variables
// finally will get executed no matter the status of the exceptions whether it is successfull or not

public class FinalChildClass extends FinalParentClass {

	public static void main(String[] args) {
		
		FinalChildClass obj = new FinalChildClass();
		obj.method();
		//obj.method01();
		obj.method02();

	}

}
