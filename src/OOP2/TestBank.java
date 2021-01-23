package OOP2;

import OOP.ICICI;
import OOP.USBank;

public class TestBank {

	public static void main(String[] args) {
		
		ICICI ic = new ICICI();
		ic.educationloan();
		ic.homeloan();
		ic.carloan();
		ic.debit();
		ic.transfermoney();
		ic.MF();
		ic.insurance();
		System.out.println(USBank.minBalance);
		
		// can be called from usbank interface
		// 100%abstraction is interface
		
		USBank us = new ICICI(); 
		us.credit();
		us.debit();
		us.transfermoney();
		
	}

}
