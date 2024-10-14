package interfcae;

public class Car extends Vehicle {
	private int seatingCapacity;
	private boolean airConditioned;

	public Car(String registrationNumber, String brand, double pricePerDay, int seatingCapacity,
			boolean airConditioned) {
		super(registrationNumber, brand, pricePerDay);
		this.seatingCapacity = seatingCapacity;
		this.airConditioned = airConditioned;
	}

	@Override
	public void displayDetails() {
		System.out.println("Car - Registration: " + registrationNumber + ", Brand: " + brand + ", Seating Capacity: "
				+ seatingCapacity + ", AC: " + airConditioned);
	}

}
