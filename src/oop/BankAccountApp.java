package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		//With Encapsulation: public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("222-222-3456");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "12345432";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		
		/*
		acc3.checkBalance();
		
		//System.out.println("Routing Number : " + acc1.routingNumber);
		
		//Demo for inheritance
		
		
		CDAccount cd1 = new CDAccount();
		cd1.interestRate = "4.5";
		acc1.accountNumber = "12345432";
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
