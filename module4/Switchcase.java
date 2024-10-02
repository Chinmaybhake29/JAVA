package module4;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number: ");
	    int num=sc.nextInt();
	    switch(num) {
	    case 5:
	    	System.out.println("moive Fri");
	    	break;
	    case 6:
	    	System.out.println("Super sat");
	    	break;
	    case 7:
	    	System.out.println("Sleepy Sun");
	    	break;
	    default:
	    	System.out.println("let us complete ");
	    }
	    
	}

}
