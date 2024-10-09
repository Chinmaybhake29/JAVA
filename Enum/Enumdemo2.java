package Enum;

interface Interface1{
	void fun1(); //abs method
	void fun2();
	void fun3();
}
enum Month implements Interface1{
	JAN, FEB, MAR,APR,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC;
	public void fun1() {
		System.out.println("this is fun1");
	}
	public void fun2() {
		System.out.println("this is fun2");
	}
	public void fun3() {
		System.out.println("this is fun3");	
	}
}

public class Enumdemo2 {

	public static void main(String[] args) {
		for (Month mm : Month.values()) {
//			Month m=Month.JAN;
//			Month m1=Month.FEB;
//			Month m2=Month.MAR;
//			int a=100;
//			System.out.println("m1 is " + m1);
//			System.out.println("m2 is " + m2);
//			System.out.println("m is " + m);
			System.out.println(mm);
		}

	}

}
