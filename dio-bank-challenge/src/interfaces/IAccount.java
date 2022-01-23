package interfaces;

import entities.Account;

public interface IAccount {
	
	void withdraw(double value);
	
	void deposit(double value);
	
	void transfer(double value, Account targetAccount);
	
	void printExtract();
}
