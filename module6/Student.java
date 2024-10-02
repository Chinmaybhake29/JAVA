package module6;

import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rollno, name, score");
		int rollno=sc.nextInt();
		String name=sc.next();
		double score=sc.nextDouble();
		
		student1 s=new student1();
		s.setRollno(rollno);
		s.setName(name);
		s.setScore(score);      //Without any parameter
		//s.display();
		
		System.out.println("Roll No: " + s.getRollno());  //Calling get Method
		System.out.println("Name: " + s.getName());
		System.out.println("Score is: " + s.getScore());
		s.markAttendance();
		
		System.out.println("=======================");
		System.out.println("Change the name");
        System.out.println("Enter the new ");
        String name1=sc.next();
        s.setName(name1);
        System.out.println("New Name is: " + s.getName());
    	System.out.println("Name: " + s.getName());
		System.out.println("Score is: " + s.getScore());
	}

}
