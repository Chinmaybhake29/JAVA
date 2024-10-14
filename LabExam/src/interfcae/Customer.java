package interfcae;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String customerName;
	private String customerID;
	private List<Rental> rentals;

	public Customer(String customerName, String customerID) {
		this.setCustomerName(customerName);
		this.customerID = customerID;
		this.rentals = new ArrayList<>();
	}

	public void rentVehicle(Vehicle vehicle, int days) {
		Rental rental = new Rental(this, vehicle, days);
		rentals.add(rental);
		vehicle.rentVehicle();
	}

	public void returnVehicle(Vehicle vehicle) {
		vehicle.returnVehicle();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
