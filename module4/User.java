package module4;

import java.util.Scanner;

public class User {

	private String name;
    private int age;
    private double sal;

    Scanner sc=new Scanner(System.in);
    
    public void accept()
    {
    	System.out.println("Enter the name, age, salary");
    	name=sc.next();
    	age=sc.nextInt();
    	sal=sc.nextDouble();
    }
    public void age()
    {
    	if(age>18)
    		System.out.println("you are eligible to vote");
    	else if(age>18 && age<100)
    		System.out.println("your age is valid");
    	else
    		System.out.println("invalid age");
    }
    public void salary()
    {
    	if(sal > 0 && sal < 100000)
    		System.out.println("Salary is valid");
    	else
    		System.out.println("invalid Salary");
    }
    public void display()
    {
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Salary: " + sal);
    }

}
