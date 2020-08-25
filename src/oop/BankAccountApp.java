package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Create new bank acc
		BankAccount acc1 = new BankAccount();
		
		//With Encapsulation
		acc1.setName("Alexander Mahone");
		System.out.println(acc1.getName());
		acc1.setSsn("5373621882");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "03262943";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);


		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
	
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "09273592";

		BankAccount acc3 = new BankAccount("Savings Account", 3000);
		acc3.accountNumber = "09273592";
		
		/*
		acc3.checkBalance();

		CDAccount cd1 = new CDAccount();
		cd1.balance = 5000;
		cd1.interestRate = "4.5";
		cd1.name = "Mahone";
		cd1.accountType = "CD Account";
		cd1.compound();
		System.out.println(cd1.toString());
		
		*/
	}

}
