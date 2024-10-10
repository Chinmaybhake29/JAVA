package Lambda;

interface Interface3{
	void absfun(int x,int y,int z);
}
public class Myclass3 {
	public static void main(String args[]) {
		Interface3 o=(int x,int y,int z)-> {
			System.out.println("x square is " + (x*x));
			System.out.println("Addition is " + (x+y+z));
			System.out.println("Multiplecation: " + (x*y*z));
		};
		o.absfun(45, 89, 50);
	}
}
