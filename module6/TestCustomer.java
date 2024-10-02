package module6;

import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter the Customer details: ");

		int custid=sc.nextInt();
		String name=sc.next();
		int mobileno=sc.nextInt();
		String address=sc.next();
		
		c.setCustid(custid);
		c.setName(name);
		c.setMobileno(mobileno);
		c.setAddress(address);
		
		
		System.out.println("Customer ID: " + c.getCustid());
		System.out.println("Customer Name: " + c.getName());
		System.out.println("Customer Mobileno: " + c.getMobileno());
		System.out.println("Customer Address: " + c.getAddress());
		
		System.out.println(c);
//		System.out.println("===============================================");
//		System.out.println("Creating the 2nd object ");
//		Customer c1=new Customer(2,"Paras",9897979,"Pune");
//		System.out.println("Displaying Details");
//		System.out.println("Customer ID" + c.getCustid());
//		System.out.println("Customer Name"+c.getName());
//		System.out.println("Customer Mobile No:"+c.getMobileno());
//		System.out.println("Customer Address:"+c.getAddress());
		

	}

}
