package application;

import entities.Account;
import entities.CheckingAccount;
import entities.Client;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Client wellington = new Client("Wellington");
		Client bruno = new Client("Bruno");
		
		Account ca = new CheckingAccount(wellington);
		ca.deposit(200);
		
		Account sa = new SavingsAccount(bruno);
		ca.transfer(50, sa);
		
		ca.printExtract();
		sa.printExtract();
	}

}
