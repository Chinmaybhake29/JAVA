package module6;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Enter the number: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("================================");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("================================");
		
		for(int temp: a) {
			System.out.println(temp);
		}

	}

}
