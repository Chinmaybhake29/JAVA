package interfacepack;

public class Rectangle implements Graphics{

	private float length, breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float area() {
		
		return (length*breadth);
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		return (2*(length+breadth));
	}

}
