package module4;

import java.util.Scanner;

public class Emp {

	private String name;
    private int empno;
    private double bal;

    Scanner sc=new Scanner(System.in);
    
    public void accept()
    {
    	System.out.println("Enter the name, age, salary");
    	name=sc.next();
    	empno=sc.nextInt();
    	bal=sc.nextDouble();
    }
    public void empno()
    {
    	 if(empno>0 && empno<10000)
    		System.out.println("your id is valid");
    	else
    		System.out.println("invalid id");
    }
    public void balance()
    {
    	if(bal > 0 && bal < 100000)
    		System.out.println("Balance is valid");
    	else
    		System.out.println("Balance Salary");
    }
    public void display()
    {
    	System.out.println("Employee number: " + empno);
    	System.out.println("Employee Name: " + name);
    	System.out.println("Employee Balance: " + bal);
    }

}
