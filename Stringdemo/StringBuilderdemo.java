package Stringdemo;

public class StringBuilderdemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Chinmay");
		sb.append(" cdac Nashik");
		System.out.println(sb);
		
		int i=sb.indexOf("r");
		System.out.println("i is " + i);
		int l1=sb.lastIndexOf("a");
		System.err.println(" i1 is " + l1);
		sb.replace(6, 9, " new ");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}

}
