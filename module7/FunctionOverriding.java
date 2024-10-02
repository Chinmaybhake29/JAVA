package module7;
class Shape {
	void calArea(String shape, int a, int b) {
		System.out.println("calArea of shape class");
	}
	void display() {
		System.out.println("Display of shape class");
	}
	void fun1() {
		System.out.println("Function1 of shape class");
	}
}
class Reactangle extends Shape
{
	void calArea(String shape, int a,int b) {
		System.out.println(" Area is " + (a * b));
	}
	void display() {
		super.display();
		super.fun1();
	}
}
public class FunctionOverriding{
	public static void main(String args[]) {
		Shape s=new Shape();
		s.calArea("Shape", 10, 20);
		s.display();
		
		System.out.println("================================");
		Reactangle rect=new Reactangle();
		rect.calArea("Reactangle", 20, 30);    //static Binding
		
		System.out.println("================================");
		s=new Reactangle();
		s.calArea("rect", 11, 12);
		s.display();                         //dynamic Binding
	}
}
