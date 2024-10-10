package Lambda;

import java.lang.ProcessHandle.Info;

interface Interface1{
	void abs(int x, int y , int z);  //abstract method
	default void fun1() {	//non abstract method 
		System.out.println("This is fun 1");
	}
	default void fun2() {
		System.out.println("this is fun 2");
	}
}
public class Myclass {

	public static void main(String[] args) {
		Interface1 fobj=(int x, int y, int z) -> System.out.println(100*x);
		fobj.abs(45, 67, 78);
		System.out.println("----------------------------------");
		fobj.fun1();
		
	}

}
