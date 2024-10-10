package Lambda;

interface Interface2{
	void cube(int x);
	default void square(int x) {
		System.out.println(x*x);
	}
}
public class Myclass2 {

	public static void main(String[] args) {
		Interface2 o=(int x1) -> System.out.println(x1*x1*x1);
		o.cube(5);
		o.square(90);
		

	}

}
