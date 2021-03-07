package OOP3;

import interfaceClass.MyInterface;

public class MyClass implements MyInterface{
	
	
	public static void main(String [] args){
		MyClass obj = new MyClass();
		obj.myMethodOne();
	}
	
	// Try to comment the below method myMethodOne and see. You will face a compilation erro. 
	// As per the rule, this class must implement the abstract method of interface
 
	@Override
	public void myMethodOne() {
 
		System.out.println("Implementation of myMethodOne");
		
	}
 
}