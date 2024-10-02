package module3;

import java.util.Scanner;

public class ifdemo5
{
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
//    	 int a, n=0, pwr=1;
//    	 System.out.println("Enter the number");
//    	 a=sc.nextInt();
//    	 
//    	 for(int i=0;i<=n;i++)
//    	 {
//    		 pwr=pwr*i;
//    	 }
//    	 System.out.println(pwr);
    	 
    	 int a=sc.nextInt();
    	 int b=sc.nextInt();
    	 int c=sc.nextInt();
    	 
    	 if(a==b)
    		 System.out.println("Same");
    	 if(a>b||a>c)
    		 System.out.println("any one of the condition is true");
    	 if(a!= b)
    		 System.out.println("both are different"); 
     }
}
