package entity;

public class Vehicle {
	
	private int vehicleid;
	private String type;
	private double isAvailabel;
	
	public Vehicle(int vehicleid, String type, int isAvailabel) {
		super();
		this.vehicleid = vehicleid;
		this.type = type;
		this.isAvailabel = isAvailabel;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getIsAvailabel() {
		return isAvailabel;
	}

	public void setIsAvailabel(int isAvailabel) {
		this.isAvailabel = isAvailabel;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", type=" + type + ", isAvailabel=" + isAvailabel + "]";
	}
}
