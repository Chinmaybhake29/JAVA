package interfcae;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
	private List<Vehicle> availableVehicles;
	private List<Vehicle> rentedVehicles;

	public RentalSystem() {
		availableVehicles = new ArrayList<>();
		rentedVehicles = new ArrayList<>();
	}

	public void addVehicle(Vehicle vehicle) {
		availableVehicles.add(vehicle);
	}

	public void showAvailableVehicles() {
		System.out.println("Available Vehicles:");
		for (Vehicle vehicle : availableVehicles) {
			if (!vehicle.isRented) {
				vehicle.displayDetails();
			}
		}
	}

	public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
		if (!vehicle.isRented) {
			customer.rentVehicle(vehicle, days);
			rentedVehicles.add(vehicle);
			availableVehicles.remove(vehicle);
			System.out.println(
					customer.getCustomerName() + " rented " + vehicle.registrationNumber + " for " + days + " days.");
		} else {
			System.out.println("Vehicle already rented.");
		}
	}

	public void returnVehicle(Customer customer, Vehicle vehicle) {
		customer.returnVehicle(vehicle);
		availableVehicles.add(vehicle);
		rentedVehicles.remove(vehicle);
		System.out.println("Vehicle returned: " + vehicle.registrationNumber);
	}

}
