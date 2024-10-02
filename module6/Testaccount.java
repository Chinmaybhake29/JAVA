package module6;

import java.util.Scanner;

public class Testaccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account a=new Account();
		
		System.out.println("Enter the details");
		
		int accNo=sc.nextInt();
		String accName=sc.next();
		double accBalance=sc.nextDouble();
		
		a.setAccNo(accNo);
		a.setAccName(accName);
		a.setAccBalance(accBalance);
		
		System.out.println(a);
	}

}
