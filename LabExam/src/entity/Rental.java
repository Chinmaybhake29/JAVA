package entity;

public class Rental {
	
	private int rentalid;
	private String vehicleid;
	
	public Rental(int rentalid, String string) {
		this.rentalid = rentalid;
		this.vehicleid = string;
	}

	public int getRentalid() {
		return rentalid;
	}

	public void setRentalid(int rentalid) {
		this.rentalid = rentalid;
	}

	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	@Override
	public String toString() {
		return "Rental [rentalid=" + rentalid + ", vehicleid=" + vehicleid + "]";
	}
	
}
