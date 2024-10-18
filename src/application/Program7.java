package application;

import entities.Accounts;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program7 {

	public static void main(String[] args) {

		Accounts acc1 = new Accounts(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Accounts acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Accounts acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}
}
