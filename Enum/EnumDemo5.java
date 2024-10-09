package Enum;

public class EnumDemo5 {
	
//	enum day{
//		Mon,Tue,Wed,Thu,Fri,Sat,Sun;
//	}
//	public static void main(String args[]) 
//	{
//	for (day d : day.values()) {
//			System.out.println(d);
//		}
//		
//	}
	enum Month1{
		JAN, FEB, MAR, APR, MAY, JUNE, JULY;
	}
	public static void main(String args[]) 
    {
		Month1 m=Month1.APR;
		System.out.println(m);
		
		switch (m) {
		case JAN:
			System.out.println("This First Month of year");
			break;
		case FEB:
			System.out.println("This Second Month of year");
			break;
		case MAR:
			System.out.println("This Third Month of year");
			break;
		case APR:
			System.out.println("This Four Month of year");
			break;
		case MAY:
			System.out.println("This Fifth Month of year");
			break;
		case JUNE:
			System.out.println("This Sixth Month of year");
			break;
		case JULY:
			System.out.println("This Seventh Month of year");
			break;
		default:
			break;
		}
    }
	
}
