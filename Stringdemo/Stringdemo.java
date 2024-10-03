package Stringdemo;

public class Stringdemo {
	public static void main(String args[]) {
		String s1 = new String("    Chinmay aa Bhake");
		String s2 = new String("   Bhake");
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 8));

		System.out.println(s1.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim().toLowerCase());
		System.out.println(s1.indexOf("h"));
		System.out.println(s1.replace("h", "ee"));
		System.out.println(s1.concat(s2));
		if (s1.equals(s2))
			System.out.println("same");
		String[] arr = s1.split(" ");
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
