package module2;

import java.util.Scanner;
public class Employee 
{
Scanner sc=new Scanner("System.in");
	
	//mv
	 private int empNo;
     private String ename;
     private double empsalasry;
    
      public void accept()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the Employee NO");
    	  empNo=sc.nextInt();
    	  System.out.println("Enter the Name");
    	  ename=sc.next();
    	  System.out.println("Enter the Salary");
    	  empsalasry=sc.nextDouble();
      }
     //mf
     public void completeProject()
     {
   	  System.out.println("Project Completed");
     }
     public void checkAttendand()
     {
   	  System.out.println("Check Attendance");
     }
     public void applyLoan()
     {
   	  System.out.println("Applay For loan\n\n");
     }
     public void display()
     {
   	  System.out.println("Emplopyee No is " + empNo);
   	  System.out.println("ename" + ename);
   	  System.out.println("Score: " + empsalasry);
     }
}
