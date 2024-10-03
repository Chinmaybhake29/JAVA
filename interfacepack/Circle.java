package interfacepack;

public class Circle implements Graphics {

	private float radius;
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (pi*radius*radius);
	}

	@Override
	public float perimeter() {
		
		return (2*pi*radius);
	}

}
