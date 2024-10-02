package Inheritance;

public class Bag {
	protected int size;
	protected String brand;
	protected String type;
	public Bag(int size, String brand, String type) {
		super();
		this.size = size;
		this.brand = brand;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Bag [size=" + size + ", brand=" + brand + ", type=" + type + "]";
	}
	
}
