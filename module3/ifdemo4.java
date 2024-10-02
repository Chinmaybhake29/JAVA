package module3;

import java.util.Scanner;

public class ifdemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		
		if(a>=0 && a<10)
			System.out.println("1 digit number");
		else if(a>=10 && a<100)
			System.out.println("2 digit number");
		else if(a>=100 && a<1000)
			System.out.println("3 digit number");
		else if(a>=1000 && a<10000)
			System.out.println("4 digit number");
		//System.out.println(Math.pow(3, 4));
	} 

}
