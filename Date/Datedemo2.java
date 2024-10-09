package Date;

import java.util.Date;
import java.text.*;
public class Datedemo2 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		//to format the data
//		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd ' at ' hh:mm:ss a");
//		//class
//		System.out.println("data is " + ft.format(d));
//		
//		SimpleDateFormat f=new SimpleDateFormat("yyyy 'year' ");
//		SimpleDateFormat f1=new SimpleDateFormat("MM 'month' ");
//		SimpleDateFormat f2=new SimpleDateFormat("dd ' date ' ");
//		
//		System.out.println("date is " + f.format(d));
//		System.out.println("date is " + f1.format(d));
//		System.out.println("date is " + f2.format(d));

		SimpleDateFormat d1=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date is: " + d1.format(d));
		
		SimpleDateFormat d2=new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(d2.format(d));
		
		SimpleDateFormat d3=new SimpleDateFormat("dd MMMM yyyy a");
		System.out.println(d3.format(d));
		
		
	}

}
