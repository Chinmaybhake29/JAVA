package interfcae;

import java.io.*;
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		RentalSystem rentalSystem = new RentalSystem();
		FileReader fr=new FileReader("D:\\GAYATRI JAVA PRG\\ASHU JAVA PRG\\ASHU\\myfile.txt");
		FileOutputStream out=new FileOutputStream("D:\\GAYATRI JAVA PRG\\ASHU JAVA PRG\\ASHU\\newmyfile.txt");
		
		Vehicle car1 = new Car("ABC123", "Toyota", 100, 5, true);

		rentalSystem.addVehicle(car1);

		Customer customer = new Customer("Chinmay", "C001");


		rentalSystem.rentVehicle(customer, car1, 3);
		rentalSystem.showAvailableVehicles();
		rentalSystem.returnVehicle(customer, car1);

		rentalSystem.showAvailableVehicles();

	}
}
