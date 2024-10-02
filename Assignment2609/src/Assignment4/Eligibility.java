package Assignment4;

import java.util.Scanner;

public class Eligibility {
	private int age;
	private String name;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		 System.out.println("Enter the name:");  
         name = sc.next(); 
         System.out.println("Enter your age:");  
         age = sc.nextInt(); 
	}
	public void checkEligibilty()
	{
		if(age>=18 && age<=100)
		{
			System.out.println("You are eligible for vote");  
        } else {  
            System.out.println("Sorry! you are not eligible vote");  
        }  
	}
	 public void display() {    
	        System.out.println("Candiate Name: " + name); 
	        System.out.println("age" + age); 
	    }  
}
