package OOP3;

public class FinalizeClass {

	// finalize is a mhod , finally is a block and final is a keyword

	public void finallymethod() {
		System.out.println("Entered the finally method");
	}

	public static void main(String[] args) {

		FinalizeClass obj = new FinalizeClass();
		obj = null;
		System.gc();

	}

}
