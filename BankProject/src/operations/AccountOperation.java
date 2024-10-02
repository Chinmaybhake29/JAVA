package operations;

import entity.Account;

public class AccountOperation {
	public boolean withdraw(Account account, double amount) {
		double bal = account.getBalance();
		if (bal < amount) {
			System.out.println("Not Enough Balance!");
			return false;
		} else if (amount < 0) {
			System.out.println("Withdrawl amount can not be negative");
			return false;

		} else {
			bal = bal - amount;
			account.setBalance(bal);
			return true;
		}
	}

	public boolean deposit(Account account, double amount) {
		double bal = account.getBalance();
		if (amount < 0) {
			System.out.println("The Amount must be greater than zero");
			return false;
		} else if (amount > 100000) {
			System.out.println("Show the proof");
			return false;

		} else {
			bal = bal + amount;
			account.setBalance(bal);
			return true;
		}
	}

	public boolean transfer(Account account1, Account account2, double amount) {
		double bal1 = account1.getBalance();
		double bal2 = account2.getBalance();

		if (amount < 0) {
			System.out.println("Transfer amount can not be -negative");
			return false;
		} else if (bal1 < amount) {
			System.out.println("Not Enough Balance");
			return false;
		} else {
			bal1 = bal1 - amount;
			bal2 = bal2 + amount;

			account1.setBalance(bal1);
			account2.setBalance(bal2);
			return true;
		}

	}
}
