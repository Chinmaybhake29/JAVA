package DuplicationDemo;
public class Student {
	   private int rollNo;
	   private Address address;
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student(Address address) {
		super();
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", address=" + address + "]";
	}
	void display()
	{
		System.out.println("rollno " + rollNo);
		
	}
}
