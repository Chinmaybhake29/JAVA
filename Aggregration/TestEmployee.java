package Aggregration;

class Address{
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}
class Emp{
	int id;
	String name;
	Address address; //has a relation
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
		System.out.println("city is " + address.city + " and State is " + address.state + " and country is " + address.country);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		Address add=new Address("Nagpur", "Maharashtra", "India");
		Address add1=new Address("Nashik", "Maharashtra", "India");
		Emp e1=new Emp(1, "Rahul", add);
		Emp e2=new Emp(2, "Shubham", add1);
		
		e1.display();
		System.out.println("==========================================================================");
		e2.display();

	}

}
