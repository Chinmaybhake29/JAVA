package module5;

class MyClass1 {
	public void fun1() {
		System.out.println("this is fun 1");
	}
}

class MyClass2 {
	public void fun2() {
		System.out.println("this is fun 2");
	}
}

public class MyClass {

	public static void main(String[] args) {
		MyClass1 m1 = new MyClass1();
		m1.fun1();
		MyClass2 m2 = new MyClass2();
		m2.fun2();

	}

}
