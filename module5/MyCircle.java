package module5;

public class MyCircle {

	public static void main(String[] args) {
		Circle c=new Circle();
		Circle c1=new Circle();
		Circle c2=new Circle();
		c.accept();
		c.calarea();
		c.calperal();
		c.display();
		
		//Hashcode
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		//equals
	    boolean result=c.equals(c2);
	    System.out.println(result);
	}

}
