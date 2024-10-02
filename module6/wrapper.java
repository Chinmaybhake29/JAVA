package module6;

public class wrapper {

	public static void main(String[] args) {
	     String s1="454";
	     String s2="777";
	     
	     String s11="789.9";
	     String s12="823.93";
	     
	     String s21="45.67";
	     String s22="89.34";
	     
	     int q1=89;
	     int q2=90;
	     
	   
	     System.out.println("Total Number: "+(Integer.parseInt(s1) + Integer.parseInt(s2)));
	     System.out.println("======================================================");
	     System.out.println("Total Number: "+(Double.parseDouble(s11) +Double.parseDouble(s12)));
	     System.out.println("======================================================");
	     System.out.println("Total float: "+(Float.parseFloat(s21) + Float.parseFloat(s22)));
	     System.out.println("Total float: "+(Integer.sum(q1, q2)));
	     System.out.println(Byte.MAX_VALUE);  //127
	     System.out.println(Short.MAX_VALUE);
	     System.out.println(Integer.MAX_VALUE);
	     System.out.println(Long.MAX_VALUE);
	     System.out.println(Float.MAX_VALUE);
	     System.out.println(Double.MAX_VALUE);
	}

}
