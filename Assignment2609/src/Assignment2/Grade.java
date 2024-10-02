package Assignment2;

import java.util.Scanner;

public class Grade {

	private int s1, s2, s3;
	private String name;
	private double avg;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		 System.out.println("Enter the name:");  
         name = sc.next(); 
         System.out.println("Enter the s1:");  
         s1 = sc.nextInt(); 
         System.out.println("Enter the s2:");  
         s2 = sc.nextInt(); 
         System.out.println("Enter the s3:");  
         s3 = sc.nextInt(); 
         avg=(s1+s2+s3)/3;
	}
	public void checkResult()
	{
		if(avg>=60 && s1>40 && s2>40 && s3>40)
		{
			System.out.println("Congratulations! Pass");  
        } else {  
            System.out.println("Sorry! Better Luck next time");  
        }  
	}
	 public void display() {    
	        System.out.println("Student Name: " + name); 
	        System.out.println("Subject 1" + s1);
	        System.out.println("Subject 2" + s2);
	        System.out.println("Subject 3" + s3);
	        System.out.println("Average: " + avg);  
	    }  
}
