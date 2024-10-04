package exception;

import java.util.Scanner;

public class SingleException {
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers...");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double result = divide(num1, num2);
			System.out.println("Result is " + result);
		} catch (ArithmeticException e) {
			System.out.println("We cannot divide the number by zero...");
//			System.out.println(e.getMessage());
//			System.out.println(e);
			e.printStackTrace();
		}

	}

}
