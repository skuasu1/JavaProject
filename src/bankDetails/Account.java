package bankDetails;

import java.util.Scanner;

public class Account {

	int accountNumber;
	String accountName;
	double amount;
	final double monthyinterest = 0.04;
	static int optionvalue;
	static String accname;
	static double openingBalance;
	static double balance;
	static int accNum;

	public Account(String owner, int initial_balance) {
		balance = initial_balance;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to our Bank. How can we help you ?");
		System.out.println("\n");
		System.out.println("Our Bank provide options to create account \n" + "1. Account Details" + "2. Savings Account"
				+ "3. Current Account\n"
				+ "Please enter the corresponding number to create type of account like 1 or 2 or 3");
		Scanner s = new Scanner(System.in);
		optionvalue = s.nextInt();
		if (optionvalue == 0 && optionvalue > 3) {
			System.out.println("U should select only options between 1,2 or 3.. Thank You");
		}

		System.out.println("You have selected Option :" + optionvalue);
		System.out.println("You are about to enter details to check Account Details \n");

		System.out.println("Enter your account name : ");
		Scanner s1 = new Scanner(System.in);
		accname = s1.nextLine();

		System.out.println("The account name entered is :" + accname);

		System.out.println("\n");
		System.out.println("Enter a opening balance amount :");
		Scanner s2 = new Scanner(System.in);
		openingBalance = s2.nextDouble();

		System.out.println("\n");
		System.out.println("Enter your Account Number : ");
		Scanner s3 = new Scanner(System.in);
		accNum = s3.nextInt();

		if (accNum > 11 && accNum == 0 && accNum < 0) {
			System.out.println("Enter valid 10 digit account number between 0-9");
		}
		System.out.println("The account number entered is :" + accNum);
		displayAccountDetails(accname, openingBalance, accNum);

	}

	// Method to display Account

	private static String displayAccountDetails(String accname, double openingBalance, int accNum) {

		System.out.println("*********Account Details are as follows ********** ");
		System.out.println("\n\t Account Name \t\t\t Account Number \t\t\t Opening Balance");
		System.out.println("\n\t" + accname + "\t\t\t\t\b" + accNum + "\t\t\t\t\b" + openingBalance);

		return accname;
	}

	// method to deposit the amount

	public void deposit(int amount) {
		balance += amount;
	}

}
