package module1;

public class HostelBoys {

	private int mobileno, age, bed, fees;
	private String name, city, blood, address;
	private String attendence, Bus;

	public void hostel() {
		System.out.println("😎😎 White House MET Boys HOSTEL 😎😎");
	}

	public void address() {
		System.out.println("Near Nishant Garden, Dhatrak Phata, Adgaon, Nashik - 422003");
	}

	public void notice() {
		System.out.println("Welcome " + name);
	}

	public void capacity() {
		System.out.println("Bed Capcity 30");
	}

	public void NightMeal() {
		System.out.println("Night Meal Timing 9 to 10");
	}

	public void display() {
		System.out.println("Student Name " + name);
		System.out.println("Contact no " + mobileno);
		System.out.println("Age " + age);
		System.out.println("City " + city);
		System.out.println("Address " + address);
		System.out.println("Blood Group " + blood);
		System.out.println("Attendence " + attendence);
		System.out.println("Bus " + Bus);
		System.out.println("Bed " + bed);
		System.out.println("Fees " + fees);
	}

	public static void main(String[] args) {
		HostelBoys h = new HostelBoys();
		h.name = "Chinmay Hemant Bhake";
		h.mobileno = 78845234;
		h.age = 20;
		h.city = "Nagpur";
		h.address = "Manewada";
		h.blood = "A+";
		h.attendence = "Full";
		h.Bus = "MH-02-2344";
		h.bed = 1;
		h.fees = 56000;

		h.hostel();
		h.address();
		h.notice();
		h.capacity();
		h.NightMeal();
		h.display();

	}

}
