package interfcae;

abstract public class Vehicle {
	protected String registrationNumber;
	protected String brand;
	protected boolean isRented;
	protected double pricePerDay;

	public Vehicle(String registrationNumber, String brand, double pricePerDay) {
		this.registrationNumber = registrationNumber;
		this.brand = brand;
		this.pricePerDay = pricePerDay;
		this.isRented = false;
	}

	public void rentVehicle() {
		this.isRented = true;
	}

	public void returnVehicle() {
		this.isRented = false;
	}

	public abstract void displayDetails();

}
