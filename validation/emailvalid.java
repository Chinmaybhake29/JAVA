package validation;
import java.util.Scanner;
public class emailvalid {

	public void checkEmail(String email)
	{
		int a=email.indexOf("@");
		int d=email.lastIndexOf(".");
		if(a>-1 && d>-1 && a<d)
			System.out.println("Valid Email ID");
		else
			System.out.println("Invalid Email ID");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    emailvalid e=new emailvalid();
		System.out.println("Enter email ID");
		String email=sc.next();
		e.checkEmail(email);

	}

}
