package MultiThreading;

class Demo{
	public void fun1() {
		System.out.println("This is fun 1");
	}
	public void fun2() {
		System.out.println("This is fun 2");
	}
}
class Multithread extends Thread{
	public void run() {
		Demo d1=new Demo();
		d1.fun1();
		d1.fun2();
		
		double id=Thread.currentThread().getId();
		String name=Thread.currentThread().getName();
		System.out.println(id);
		System.out.println(name);
	}
}
public class Multithreadingdemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Multithread m1=new Multithread();
			m1.start();
			
		}
 		
	}

}
