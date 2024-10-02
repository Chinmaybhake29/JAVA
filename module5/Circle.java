package module5;

import java.util.Scanner;

public class Circle 
{
	private double radius;
	private double area1;
	private double peri;
	
	final Double pi=3.14;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter the value radius");
		radius=sc.nextDouble();
	}
	public void display()
	{
		System.out.println("Radius is: " + radius);
		System.out.println("Area is: " + area1);
		System.out.println("perimeter is: " + peri);
	}
	public void calarea()
	{
		area1=pi*radius*radius;
	}
	public void calperal()
	{
		peri=2*pi*radius;
	}
	
}
