package Testpack;

import java.util.Scanner;

public class Test2 {
	static int id;
	static {
		id=1000;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int count=0;
		
		Person1[] persons = new Person1[size];
		boolean exit = true;
		while (exit) {
			System.out.println("************ Welcome to XYZ Event ************ \n1. Register Student. ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				if(count<size) {
				System.out.println("Enter your first name:");
				String name=sc.next();
				System.out.println("Enter your Last name:");
				String lname=sc.next();
				System.out.println("Enter your College name:");
				String clg=sc.next();
				System.out.println("Enter your Rollno:");
				int rollno=sc.nextInt();
				System.out.println("Enter your Marks name:");
				int marks=sc.nextInt();
				System.out.println("Enter your course name:");
				String course=sc.next();
				int seatno=id++;
				persons[count++]=new Student(lname, name, clg, seatno, rollno, marks, course);
				
				} else {
					System.out.println("Sorry! No More add");
				}
				break;
			}
			case 2: {
				if(count<size) {
					System.out.println("Enter your first name:");
					String name=sc.next();
					System.out.println("Enter your Last name:");
					String lname=sc.next();
					System.out.println("Enter your College name:");
					String clg=sc.next();
					System.out.println("Enter Emp id:");
					int id=sc.nextInt();
					System.out.println("Enter Subject:");
					String subject=sc.next();
					System.out.println("Enter Salary:");
					int sal=sc.nextInt();
					int seatno=id++;
					persons[count++]=new Teacher(name, lname, clg, seatno, id, seatno, subject, sal, subject, seatno);
					
					} else {
						System.out.println("Sorry! No More add");
					}
				break;
			}
			case 3: {
				System.out.println("============= Students =============");
				for(Person1 p: persons) {
					if( p instanceof Student) {
					System.out.println(p);
					}
				}
				System.out.println("============= Teachers =============");
				for(Person1 p: persons) {
					if( p instanceof Teacher) {
					System.out.println(p);
					}
				}
				break;
			}
			case 4: {
				System.out.println("Enter Seat Number: ");
				int flag=0;
				int seatNo=sc.nextInt();
				for (int i = 0; i < persons.length; i++) {
					if(persons[i].seatno == seatNo) {
						if(persons[i]instanceof Student) {
							((Student)persons[i]).tolearn();
						}else {
							flag=1;
						}
					}
					if(flag == 1) {
						System.out.println("Not Found");
					}
				}
						
			}
			default:
				;
			}
		}
	}
}
