package Inheritance;

public class College extends Bag{
	protected String modelno;
	protected String storage;
	protected float weight;
	public College(int size, String brand, String type, String modelno, String storage, double weight) {
		super(size, brand, type);
		this.modelno = modelno;
		this.storage = storage;
		this.weight = (float) weight;
	}
	@Override
	public String toString() {
		return "College [modelno=" + modelno + ", storage=" + storage + ", weight=" + weight + ", size=" + size
				+ ", brand=" + brand + ", type=" + type + "]";
	}
	
	
}
