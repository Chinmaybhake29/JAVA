package Inheritance;

public class Trolly extends Bag{
	    protected String modelno;
		protected double weight;
		protected int wheels;
		protected int coaches;
		public Trolly(String modelno, int size, String brand, String type, double weight, int wheels, int coaches) {
			super(size, brand, type);
			this.modelno=modelno;
			this.weight = weight;
			this.wheels = wheels;
			this.coaches = coaches;
		}
		@Override
		public String toString() {
			return "Trolly [modelno=" + modelno + ", weight=" + weight + ", wheels=" + wheels + ", coaches=" + coaches + ", size=" + size
					+ ", brand=" + brand + ", type=" + type + "]";
		}
		
		
}
