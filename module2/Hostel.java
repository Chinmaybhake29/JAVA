package module2;

import java.util.Scanner;

public class Hostel {

	private int mobileno, age, bed, fees;
	private String name, city, blood, address;
	private String attendence, Bus;

	public void hostel() {
		System.out.println("😎😎 White House MET Boys HOSTEL 😎😎");
	}

	public void address() {
		System.out.println("Near Nishant Garden, Dhatrak Phata, Adgaon, Nashik - 422003");
	}

	public void notice() {
		System.out.println("Welcome " + name);
	}

	public void capacity() {
		System.out.println("Bed Capcity 30");
	}

	public void NightMeal() {
		System.out.println("Night Meal Timing 9 to 10");
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Name ");
		name = sc.nextLine();
		System.out.println("Contact no ");
		mobileno = sc.nextInt();
		System.out.println("Age ");
		age = sc.nextInt();
		System.out.println("City ");
		city = sc.nextLine();
		System.out.println("Address ");
		address = sc.nextLine();
		System.out.println("Blood Group ");
		blood = sc.nextLine();
		System.out.println("Attendence ");
		attendence = sc.nextLine();
		System.out.println("Bus ");
		Bus = sc.nextLine();
		System.out.println("Bed ");
		bed = sc.nextInt();
		System.out.println("Fees ");
		fees = sc.nextInt();
	}

	public void display() {

		System.out.println("Student Name " + name);
		System.out.println("Contact no " + mobileno);
		System.out.println("Age " + age);
		System.out.println("City " + city);
		System.out.println("Address " + address);
		System.out.println("Blood Group " + blood);
		System.out.println("Attendence " + attendence);
		System.out.println("Bus " + Bus);
		System.out.println("Bed " + bed);
		System.out.println("Fees " + fees);
	}

}
