package module3;

import java.util.Scanner;

public class ifdemo2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = sc.nextInt();
		int num1 = sc.nextInt();

		if (num > num1) {
			System.out.println(num + " is a largest number");
		} else {
			System.out.println(num1 + " is a largest number");
		}
	}
}
