package entities;

public class SavingsAccount extends Account {
	
	public SavingsAccount() {
	}
	
	public SavingsAccount(Client client) {
		super(client);
	}

	@Override
	public void printExtract() {
		System.out.println("=== Savings Account Extract ===");
		super.printAccountInfo();
	}	
}
