package Lambda;

interface Interface4{
	void eveodd(int x);
}
public class MyClass4 {
	public static void main(String args[]) {
		Interface4 obj=(int x)->{
			if(x%2==0)
				System.out.println(x + " is a even number ");
			else
				System.out.println(x + " is a odd number");
		};
		obj.eveodd(77);
	}
}
