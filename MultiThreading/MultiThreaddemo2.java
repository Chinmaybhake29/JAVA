package MultiThreading;

class Multithread2 implements Runnable{
	public void fun1() {
		System.out.println("this is fun 1");
	}
	public void fun2() {
		System.out.println("this is fun 2");
	}
	
	public void run() {
		fun1();
		fun2();
		System.out.println("Id is: " + Thread.currentThread().getId());
		System.out.println("Name: " + Thread.currentThread().getName());
	}
}
public class MultiThreaddemo2 {

	public static void main(String[] args) {
		Multithread2 obj=new Multithread2();
		Thread t=new Thread(obj);
		t.start();
		
		
		System.out.println("=====================================");
		
		Multithread2 m=new Multithread2();
		Thread th=new Thread(m);
		th.start();
		
		System.out.println("Id is: " + th.getId());
		System.out.println("Name is: " + th.getName());
	}

}
