package entities;

import interfaces.IAccount;

public abstract class Account implements IAccount{
	
	private static final int STANDARD_AGENCY = 1;
	private static int SEQUENCE = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	private Client owner;

	public Account() {
	}
	
	public Account(Client owner) {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENCE++;
		this.owner = owner;
	}
	
	public Client getOwner() {
		return owner;
	}

	public int getagency() {
		return agency;
	}

	public int getnumber() {
		return number;
	}

	public double getbalance() {
		return balance;
	}

	@Override
	public void withdraw(double value) {
		if (balance - value > 0)
			balance -= value;
		else
			balance = 0;
	}

	@Override
	public void deposit(double value) {
		balance += value;	
	}

	@Override
	public void transfer(double value, Account targetAccount) {
		this.withdraw(value);
		targetAccount.deposit(value);
	}
	
	protected void printAccountInfo() {
		System.out.println(String.format("Owner: %s", owner.getName()));
		System.out.println(String.format("Agency: %d", agency));
		System.out.println(String.format("Number: %d", number));
		System.out.println(String.format("Balance: %.2f", balance));
	}
}
