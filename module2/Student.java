package module2;

import java.util.Scanner;

public class Student {
	
	
	//mv
	 private int rollno;
     private String name;
     private double score;
    
      public void accept()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter the rollno");
    	  rollno=sc.nextInt();
    	  System.out.println("Enter the Name");
    	  name=sc.nextLine();
    	  System.out.println("Enter the Score");
    	  score=sc.nextDouble();
      }
      public void display()
      {
    	  System.out.println("RollNo is " + rollno);
    	  System.out.println("Student Name " + name);
    	  System.out.println("Score: " + score);
      }
     //mf
     public void attendClass()
     {
   	  System.out.println("attending the class");
     }
     public void appearexam()
     {
   	  System.out.println("appear the exam");
     }
     public void completeassignment()
     {
   	  System.out.println("Completing Assignment\n\n");
     }

}
