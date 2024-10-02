
package userinterface;

import java.util.Scanner;
import entity.Account;
import operations.AccountOperation;
import validation.AccounValidation;
public class TestAccount {
	public static void main(String args[]) {
		Account account1 = new Account();
		Account account2 = new Account();
		AccountOperation accountOperation = new AccountOperation();
		AccounValidation accounValidation = new AccounValidation();
		int ch;
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" Welcome to HDFC bank");
			System.out.println("1.Accept Details");
			System.out.println("2.Display details");
			System.out.println("3.Withdraw amount");
			System.out.println("4.Deposite amount");
			System.out.println("5.Transfer amount");
			System.out.println("6.Check Balance");
			System.out.println("7.Update The Balance");
			System.out.println("8.Exit");

			System.out.println("enter your choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1: 
				System.out.println("Enter the accno, holder name, balance");
				int accNo=sc.nextInt();
				String accHolderName=sc.next();
				double balance=sc.nextDouble();
				
				boolean result11=accounValidation.checkinformation(accNo, accHolderName, balance);
				if(result11==true) {
					System.out.println("All the input are valid");
					account1.setAccNo(accNo);
					account1.setAccHolderName(accHolderName);
					account1.setBalance(balance);
				} else {
					System.out.println("Invalid Inputs.............");
				}
				break;
				
			case 2:
				System.out.println("display details");
				System.out.println("Account Deatils: " + account1.getAccNo());
				System.out.println("Account Holder Name: " + account1.getAccHolderName());
				System.out.println("Balance: " + account1.getBalance());
				break;
				
			case 3:
				System.out.println(" withdraw amount");
				double amount = sc.nextDouble();
				boolean result = accountOperation.withdraw(account1, amount);
				if (result == true) {
					System.out.println("Withdraw is successsful");
					System.out.println("the new balance is: " + account1.getBalance());
				} else {
					System.out.println("Withdraw is failed");
				}
				break;
				
			case 4:
				System.out.println(" deposite amount");
				double amount1=sc.nextDouble();
				boolean result1=accountOperation.deposit(account1, amount1);
				if(result1==true) {
					System.out.println("Deposit Successful");
					System.out.println("The new balance is: " + account1.getBalance());
				} else {
					System.out.println("Deposit is failed");
				}
				break;
				
			case 5:
				System.out.println("Enter the accno, holder name, balance");
				 accNo=sc.nextInt();
				accHolderName=sc.next();
				balance=sc.nextDouble();
				
				result11=accounValidation.checkinformation(accNo, accHolderName, balance);
				if(result11==true) {
					System.out.println("All the input are valid");
					account2.setAccNo(accNo);
					account2.setAccHolderName(accHolderName);
					account2.setBalance(balance);
				} else {
					System.out.println("Invalid Inputs.............");
				}
				
				System.out.println(" transfer amount");
				amount=sc.nextDouble();
				result=accountOperation.transfer(account1, account2, amount);
				if(result==true) {
					System.out.println("Transfer Successfully");
					System.out.println("The new balance of account 1 is: " + account1.getBalance());
					System.out.println("The new balance of account 2 is: " + account2.getBalance());
				} else {
					System.out.println("Transfer is failed");
				}
				break;
				
			case 6:
				System.out.println(" The Balance is " + account1.getBalance());
				break;
				
			case 7:
				System.out.println("Update the Balance");
				balance=sc.nextDouble();
				account1.setBalance(balance);
				System.out.println("Updated Balance");
				System.out.println(account1);
				break;
				
			case 8:
				System.exit(0);
			}
			System.out.println("Do you want to continue?(y/n)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("thnak you for visiting !!!!");

	}
}
