package interfacepack;

public class Test {

	public static void main(String[] args) {
		Circle c=new Circle(7.89f);
		System.out.println(c.area());
		System.out.println(c.perimeter());
		
		Rectangle r=new Rectangle(4.7f, 8.9f);
		System.out.println(r.area());
		System.out.println(r.perimeter());
		

	}

}
