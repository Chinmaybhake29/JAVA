package interfcae;

public class Rental {
	private Vehicle vehicle;
	private Customer customer;
	private int rentalDays;
	private double totalRentalPrice;

	public Rental(Customer customer, Vehicle vehicle, int rentalDays) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.rentalDays = rentalDays;
		this.totalRentalPrice = rentalDays * vehicle.pricePerDay;
	}

	public double calculateTotalPrice() {
		return totalRentalPrice;
	}
}
