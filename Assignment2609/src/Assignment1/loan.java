package Assignment1;  

  
import java.util.Scanner;  

public class loan {  

    private int age;  
    private String name;  
    private double income;  
    
    Scanner sc = new Scanner(System.in);  
    
    public void accept() {  

            System.out.println("Enter the name:");  
            name = sc.next(); 
            System.out.println("Enter the age:");  
            age = sc.nextInt();  
            System.out.println("Enter the income:");  
            income = sc.nextDouble();    
   
    }  

    public void checkEligibility() {  
        if (income > 0 && income < 100000 && age >= 18 && age <= 60) {  
            System.out.println("Congratulations! You are eligible for a loan.");  
        } else {  
            System.out.println("Sorry! You are not eligible for a loan.");  
        }  
    }  

    public void display() {  
        System.out.println("Age: " + age);  
        System.out.println("Applier Name: " + name);  
        System.out.println("Income: " + income);  
    }  

}