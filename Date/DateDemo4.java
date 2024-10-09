package Date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo4 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		TimeZone z=TimeZone.getTimeZone("CST");
		Calendar cal=Calendar.getInstance(z);
		
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int dow=cal.get(Calendar.DAY_OF_WEEK);
		int doy=cal.get(Calendar.DAY_OF_YEAR);
		int m=cal.get(Calendar.MONTH);
		int y=cal.get(Calendar.YEAR);
		int h=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);
		
		System.out.println("Day is " + day);
		System.out.println("Day of the week " + dow);
		System.out.println("Day of year " + doy);
		System.out.println(day + "/" + m + "/" + y + " " + h + ":" + min + ":" + s);
}
}