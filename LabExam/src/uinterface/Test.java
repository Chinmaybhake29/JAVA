package uinterface;

import entity.Rental;
import entity.customer;

public class Test {
		public static void main(String args[]) {
			customer c=new customer(1, "Chinmay");
			Rental r=new Rental(1, "S5678");
			r.getRentalid();
			r.getVehicleid();
			r.setRentalid(0);
			r.setVehicleid("101");
			
			
		}
}
