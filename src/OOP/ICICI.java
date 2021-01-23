package OOP;

public class ICICI implements USBank, RBI {

// methods fromRBi
	@Override
	public void educationloan() {
		System.out.println("RBI- educationloan");
	}

	@Override
	public void homeloan() {
		System.out.println("RBI- DEBit");
	}

	@Override
	public void carloan() {
		System.out.println("RBI- carloan");
	}

	// methods from US interface
	@Override
	public void debit() {
		System.out.println("US- DEBit");
	}

	@Override
	public void credit() {
		System.out.println("US- credit");
	}

	@Override
	public void transfermoney() {
		System.out.println("US- transfermoney");
	}
	// ICIC bank methods
	
	public void MF() {
		System.out.println("ICICi - MF");
		
	}
	public void insurance() {
		System.out.println("ICICi - insurance");
		
	}
}
